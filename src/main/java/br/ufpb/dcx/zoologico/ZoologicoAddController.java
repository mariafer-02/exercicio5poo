package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZoologicoAddController implements ActionListener {
    private Zoologico zoologico;
    private JFrame janelaPrincipal;

    public ZoologicoAddController(Zoologico zoologico, JFrame janela) {
        this.zoologico = zoologico;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed (ActionEvent e){
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome do animal?");
        String especie = JOptionPane.showInputDialog(janelaPrincipal, "Qual espécie do animal?");
        int idade  = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual a idade do animal? "));
        boolean cadastrou = zoologico.CadastraAnimal(nome, especie, idade);
        if (cadastrou) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Animal cadastrado!");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Animal não cadastrado. Tente novamente.");
        }
    }
}
