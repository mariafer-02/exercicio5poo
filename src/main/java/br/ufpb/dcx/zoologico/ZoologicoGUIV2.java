package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.*;

public class ZoologicoGUIV2 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon bichosImg = new ImageIcon("./img/zoologico.jpg");
    public ZoologicoGUIV2(){
        setTitle ("Zoológico de animais selvagens");
        setSize (400, 400);
        setLocation(0,0);
        setResizable(false);
        getContentPane().setBackground(Color.green);
        linha1 = new JLabel("Zoológico de animais selvagens", JLabel.CENTER);
        linha1.setForeground(Color.white);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(bichosImg,JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(4, 2));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }
    public static void main (String [] args) {
        JFrame janela = new ZoologicoGUIV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
