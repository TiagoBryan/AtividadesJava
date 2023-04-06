/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class janela1 extends JFrame {
    public janela1(){
        super("Programação Orientada a Objeto");
        setSize(450, 250);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String args[] ){
        janela1 app = new janela1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
