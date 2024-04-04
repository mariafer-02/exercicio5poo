package br.ufpb.dcx.zoologico;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    public static final String ARQUIVO_ANIMAIS = "animais.dat";

    public HashMap<String, Animal> recuperarAnimais() throws IOException {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(ARQUIVO_ANIMAIS));
            return (HashMap<String, Animal>) in.readObject();
        } catch (Exception e){
            System.out.println("Não foi possível recuperar os dados dos animais");
            throw new IOException("Não foi possível recuperar os dados do arquivo "+ARQUIVO_ANIMAIS);

        } finally {
            if (in!=null){
                in.close();
            }
        }
    }

    public void salvarAnimais(Map<String, Animal> animal) throws IOException{
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_ANIMAIS));
            out.writeObject(animal);
        } catch (Exception e){
            e.printStackTrace();
            throw new IOException("Erro ao salvar os contatos no arquivo "+ARQUIVO_ANIMAIS);
        }
    }
}
