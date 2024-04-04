package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.*;

public class ZoologicoGUIV3 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon bichosImg = new ImageIcon("./img/zoologico.jpg");
    ImageIcon addImg = new ImageIcon ("./img/adiciona.png");
    ImageIcon pesqImg = new ImageIcon("./img/pesquisar.png");
    ImageIcon removerImg = new ImageIcon("./img/remove.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    Zoologico zoologico = new ZoologicoMaria();

    public ZoologicoGUIV3(){
        setTitle("Terras dos Bichos");
        setSize (600,300);
        setLocation(150,150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel ("Zoológico", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Serif", Font.BOLD,24));
        linha2 = new JLabel(bichosImg,JLabel.CENTER);
        Image imagemAddRedimensionada = addImg.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon addImgRedimensionada = new ImageIcon(imagemAddRedimensionada);
        botaoAdicionar = new JButton("Adicionar", addImgRedimensionada);
        botaoAdicionar.addActionListener(new ZoologicoAddController(zoologico,this));
        Image imagempesqRedimensionada = pesqImg.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon pesqImgRedimensionada = new ImageIcon(imagempesqRedimensionada);
        botaoPesquisar = new JButton("Pesquisar", pesqImgRedimensionada);
        botaoPesquisar.addActionListener(new ZoologicoSearchController(zoologico,this));
        Image imagemremoverRedimensionada = removerImg.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon removerImgRedimensionada = new ImageIcon(imagemremoverRedimensionada);
        botaoRemover = new JButton("Remover", removerImgRedimensionada);
        botaoRemover.addActionListener(new ZoologicoRemoveController(zoologico, this) );
        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }
    public static void main (String [] args) {
        JFrame janela = new ZoologicoGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
