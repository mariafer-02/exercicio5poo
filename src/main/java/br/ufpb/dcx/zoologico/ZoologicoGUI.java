package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ZoologicoGUI extends JFrame {
    public ZoologicoGUI(){
        setTitle("Zoologico de animais selvagens");
        setSize(300,300);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.lightGray);
    }
    //...
    public static void main(String [] args){
        ZoologicoGUI janela = new ZoologicoGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e){

                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);

    }
}
