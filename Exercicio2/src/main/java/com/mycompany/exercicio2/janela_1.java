/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class janela_1 extends JFrame{
    public janela_1(){
        super("Programação Orientada a Objeto");
        setExtendedState(MAXIMIZED_BOTH);
        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        Container tela = getContentPane();
        tela.setBackground(new Color(125,125,125));
        ImageIcon icone = new ImageIcon("batman.png");
        setIconImage(icone.getImage());
    }
    public static void main(String args[] ){
        janela_1 app = new janela_1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
