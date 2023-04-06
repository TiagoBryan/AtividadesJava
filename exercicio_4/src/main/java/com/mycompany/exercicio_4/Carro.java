/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Carro {
    String marca = JOptionPane.showInputDialog("Digite a marca do veiculo");
    String modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo");
    String cor = JOptionPane.showInputDialog("Digite a cor do veiculo");
    String placa = JOptionPane.showInputDialog("Digite a placa do veiculo");
    
    public static void ligar(){
        JOptionPane.showMessageDialog(null, "O Carro está Ligado");
    }
    public static void desligar(){
        JOptionPane.showMessageDialog(null, "O Carro está Desligado");
    }
    public static void acelerar(){
        JOptionPane.showMessageDialog(null, "O Carro está Acelerando");
    } 
    public static void frear(){
        JOptionPane.showMessageDialog(null, "O Carro está freando");
    }
}


