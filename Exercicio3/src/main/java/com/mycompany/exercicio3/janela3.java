/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class janela3 extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    public janela3(){
            super("ExemploLabel");
            Container tela = getContentPane();
            setResizable(false);
            setSize(250, 300);
            setLocationRelativeTo(null);
            tela.setBackground(Color.cyan);
            ImageIcon icone = new ImageIcon("batman2.png");
            setIconImage(icone.getImage());
            setVisible(true);
        
        setLayout(null);
            rotulo1 = new JLabel ("Cadastro de Clientes");
            rotulo1.setBounds(50,20,1000,20);
            rotulo1.setForeground(Color.blue);
            rotulo1.setFont(new Font("Arial", Font.BOLD,12));
            tela.add(rotulo1);
            
            rotulo2 = new JLabel ("Nome :");
            rotulo2.setBounds(20,50,1000,20);
            rotulo2.setForeground(Color.black);
            rotulo2.setFont(new Font("Arial", Font.BOLD,12));
            tela.add(rotulo2);
            
            rotulo3 = new JLabel ("Endereço :");
            rotulo3.setBounds(20,80,1000,20);
            rotulo3.setForeground(Color.black);
            rotulo3.setFont(new Font("Arial", Font.BOLD,12));
            tela.add(rotulo3);
            
            rotulo4 = new JLabel ("Cidade :");
            rotulo4.setBounds(20,110,1000,20);
            rotulo4.setForeground(Color.black);
            rotulo4.setFont(new Font("Arial", Font.BOLD,12));
            tela.add(rotulo4);
            
            rotulo5 = new JLabel ("Estado :");
            rotulo5.setBounds(20,140,1000,20);
            rotulo5.setForeground(Color.black);
            rotulo5.setFont(new Font("Arial", Font.BOLD,12));
            tela.add(rotulo5);
            
            rotulo6 = new JLabel ("CEP :");
            rotulo6.setBounds(20,170,1000,20);
            rotulo6.setForeground(Color.black);
            rotulo6.setFont(new Font("Arial", Font.BOLD,12));
            tela.add(rotulo6);
            
            
            rotulo7 = new JLabel ("Telefone :");
            rotulo7.setBounds(20,200,1000,20);
            rotulo7.setForeground(Color.black);
            rotulo7.setFont(new Font("Arial", Font.BOLD,12));
            tela.add(rotulo7);
        
       
    }
    public static void main(String args[] ){
        janela3 app = new janela3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
