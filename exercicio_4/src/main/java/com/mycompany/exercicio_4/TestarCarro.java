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
public class TestarCarro {
    public static void main(String args[] ){
        Carro carro = new Carro();
        String marca = carro.marca;
        String modelo = carro.modelo;
        String cor = carro.cor;
        String placa = carro.placa;
        JOptionPane.showMessageDialog(null,"A marca do veiculo é " +marca);
        JOptionPane.showMessageDialog(null,"O modelo do veiculo é " +modelo);
        JOptionPane.showMessageDialog(null,"A cor do veiculo é " +cor);
        JOptionPane.showMessageDialog(null,"A placa do veiculo é " +placa);
        carro.ligar();
        carro.acelerar();
        
    }
}
