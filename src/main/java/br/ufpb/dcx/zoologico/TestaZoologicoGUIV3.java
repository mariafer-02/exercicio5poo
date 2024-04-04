package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestaZoologicoGUIV3 {
        public static void main(String [] args){
            JFrame janela = new ZoologicoGUIV3();
            janela.setVisible(true);
            janela.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            janela.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    int resp = JOptionPane.showConfirmDialog(janela,
                            "Tem certeza de que quer sair?");
                    if (resp == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                }
            });
        }
    }

