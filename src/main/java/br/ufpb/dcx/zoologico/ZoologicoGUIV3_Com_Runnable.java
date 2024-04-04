package br.ufpb.dcx.zoologico;

import javax.swing.*;

public class ZoologicoGUIV3_Com_Runnable {
    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame janela = new ZoologicoGUIV3();
                janela.setVisible(true);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
