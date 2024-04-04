package br.ufpb.dcx.zoologico;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ZoologicoMaria implements Zoologico {
    private Map<String, Animal> animais;
    private GravadorDeDados gravador = new GravadorDeDados();

    public ZoologicoMaria() {
        this.animais = new HashMap<>();
        salvarDados();
        recuperaDados();

    }

    public void salvarDados () {
        try {
            this.gravador.salvarAnimais (this.animais);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void recuperaDados() {
        try {
            this.animais = this.gravador.recuperarAnimais();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    @Override
    public boolean CadastraAnimal (String nome, String especie, int idade) {
        if (!animais.containsKey(nome)) {
            this.animais.put (nome, new Animal (nome, especie, idade));
            salvarDados();
            return true;
        } else {
            return false;
        }
    }
    @Override
    public Collection<Animal> pesquisaAnimais (String especie, int idade) {
        Collection<Animal> animaisAchados = new ArrayList<>();
        for (Animal a: this.animais.values()){
            if (a.getEspecie().equals(especie) && a.getIdade()==idade){
                animaisAchados.add(a);
            }
        }
        return animaisAchados;
    }
    @Override
    public boolean removeAnimal (String nome) {
        if (this.animais.containsKey(nome)){
            this.animais.remove(nome);
            return true;
        } else {
            return false;
        }
    }
}
