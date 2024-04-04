package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.*;

public class TestaJanelaSimples2 {
    public static void main(String [] args){
        JFrame janela = new JFrame();
        janela.setTitle("Janela de Maria");
        janela.setLocation(0,0);
        janela.setSize(400,400);
        JButton botao = new JButton("Meu Botão");
        botao.setToolTipText("Botão de teste");
        botao.addActionListener((ae) -> {
            JOptionPane.showMessageDialog(janela, "Testando botão");
        });
        janela.setLayout(new GridLayout(3,1));
        janela.add(new JLabel());
        janela.add(botao);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
