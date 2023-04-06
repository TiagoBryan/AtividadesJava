/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeirajanela;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela(){
        super("nossa primeira janela");
        setSize(300, 150);
        setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH);
        //setExtendedState(ICONIFIED);
        setResizable(false);
        setLocationRelativeTo(null);
        Container tela = getContentPane();
        //tela.setBackground(Color.yellow);
        //tela.setBackground(new Color(255,128,128));
       //ImageIcon icone = new ImageIcon("batman.png");
       //setIconImage(icone.getImage());
        
    }
    
    public static void main(String args[] ){
        PrimeiraJanela app = new PrimeiraJanela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
