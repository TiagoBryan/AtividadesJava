/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_aula3;


import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
public class interfaceGrafica3 extends JFrame{
     JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8;
     JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    public interfaceGrafica3(){
        super("ExemploLabel");
        Container tela = getContentPane();
        tela.setBackground(new Color(238,238,209));
        setLayout(null);
        rotulo8 = new JLabel ("Cadastro de Cliente");
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("CPF");
        rotulo3 = new JLabel ("RG");
        rotulo4 = new JLabel ("Endereço");
        rotulo5 = new JLabel ("Cidade");
        rotulo6 = new JLabel ("Estado");
        rotulo7 = new JLabel ("CEP");
        texto1= new JTextField (50);
        texto2 = new JTextField (11);
        texto3 = new JTextField (7);
        texto4 = new JTextField (100);
        texto5 = new JTextField (50);
        texto6 = new JTextField (50);
        texto7 = new JTextField (8);
        
        rotulo8.setBounds(120,10,200,20);
        rotulo1.setBounds(50,40,80,20);
        rotulo2.setBounds(50,80,80,20);
        rotulo3.setBounds(50,120,80,20);
        rotulo4.setBounds(50,160,80,20);
        rotulo5.setBounds(50,200,80,20);
        rotulo6.setBounds(50,240,80,20);
        rotulo7.setBounds(50,280,80,20);
        texto1.setBounds(50,60,260,20);
        texto2.setBounds(50,100,130,20);
        texto3.setBounds(50,140,120,20);
        texto4.setBounds(50,180,260,20);
        texto5.setBounds(50,220,245,20);
        texto6.setBounds(50,260,215,20);
        texto7.setBounds(50,300,120,20);
   
        rotulo8.setFont(new Font("Arial", Font.BOLD, 16));
        rotulo8.setForeground(Color.red);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        setSize(400, 450);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        interfaceGrafica3 app = new interfaceGrafica3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
