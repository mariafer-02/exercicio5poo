package br.ufpb.dcx.zoologico;

import javax.swing.*;
import java.awt.*;

    public class ZoologicoGUIV3ComMenu extends JFrame {
        JLabel linha1, linha2;
        ImageIcon bichosImg = new ImageIcon("./imgs/zoologico.jpg");
        Zoologico zoologico = new ZoologicoMaria();
        JMenuBar barraDeMenu = new JMenuBar();

        public ZoologicoGUIV3ComMenu() {
            setTitle("Zoológico de animais selvagens");
            setSize(800, 600);
            setLocation(150, 150);
            setResizable(false);
            setBackground(Color.white);
            linha1 = new JLabel("Zoológico de animais", JLabel.CENTER);
            linha1.setForeground(Color.red);
            linha1.setFont(new Font("Serif", Font.BOLD, 24));
            linha2 = new JLabel(bichosImg, JLabel.CENTER);
            setLayout(new GridLayout(3, 1));
            add(linha1);
            add(linha2);
            add(new JLabel());
            JMenu menuCadastrar = new JMenu("Cadastrar");
            JMenuItem menuCadastrarAnimal = new JMenuItem(
                    "Cadastrar animal");
            menuCadastrar.add(menuCadastrarAnimal);
            JMenu menuPesquisar = new JMenu("Pesquisar");
            JMenuItem menuPesquisarAnimal= new JMenuItem(
                    "Pesquisar animal");
            menuPesquisar.add(menuPesquisarAnimal);
            JMenu menuRemover = new JMenu("Remover");
            JMenuItem menuRemoverAnimal = new JMenuItem(
                    "Remover animal");
            menuRemover.add(menuRemoverAnimal);
            menuPesquisarAnimal.addActionListener(
                    new ZoologicoSearchController(zoologico,this));
            menuRemoverAnimal.addActionListener(
                    new ZoologicoRemoveController(zoologico, this));
            menuCadastrarAnimal.addActionListener(
                    (ae) -> {
                        String nome = JOptionPane.showInputDialog(this,
                                "Qual o nome do animal?");
                        String especie = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog(this,
                                "Qual a especie dp animal?")));
                        int idade = Integer.parseInt(JOptionPane.showInputDialog(this,
                                "Qual a idade do animal?"));
                        boolean cadastrou = zoologico.CadastraAnimal(nome, especie, idade);
                        if (cadastrou) {
                            JOptionPane.showMessageDialog(this,
                                    "Animal cadastrado!");
                        } else {
                            JOptionPane.showMessageDialog(this,
                                    "Animal não encontrado.");
                        }
                    });
            barraDeMenu.add(menuCadastrar);
            barraDeMenu.add(menuPesquisar);
            barraDeMenu.add(menuRemover);
            setJMenuBar(barraDeMenu);
        }

        //...
        public static void main(String[] args) {
            JFrame janela = new ZoologicoGUIV3ComMenu();
            janela.setVisible(true);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

