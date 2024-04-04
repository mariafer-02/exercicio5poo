package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZoologicoRemoveController implements ActionListener {
    private Zoologico zoologico;
    private JFrame janelaPrincipal;
    public ZoologicoRemoveController(Zoologico zoologico, JFrame janela){
        this.zoologico = zoologico;
        this.janelaPrincipal = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome do animal a remover?");
        boolean removeu = zoologico.removeAnimal(nome);
        if (removeu) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Animal removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Nome do animal não encontrado.");
        }
    }

}
