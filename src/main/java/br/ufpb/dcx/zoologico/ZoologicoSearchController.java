package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class ZoologicoSearchController implements ActionListener {
    private Zoologico zoologico;
    private JFrame janelaPrincipal;

    public ZoologicoSearchController(Zoologico zoologico, JFrame janela) {
        this.zoologico = zoologico;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String especie = (JOptionPane.showInputDialog(janelaPrincipal,
                "Qual a especie do animal a pesquisar?"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Qual a idade do animal a pesquisar?" ));
        Collection<Animal> animais = zoologico.pesquisaAnimais(especie, idade);
        if (animais.size()>0){
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Animais encontrados:");
            for (Animal a: animais){
                JOptionPane.showMessageDialog(janelaPrincipal, a.toString());
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Não foi encontrado nenhum animal com nesta especie e com essa idade");
        }
    }
}
