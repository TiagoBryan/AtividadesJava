/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionario2;

import javax.swing.JOptionPane;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Questionario2 {

    public static void main(String[] args) {
        diferenca();
    }
    static void diferenca(){
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        if(valor1>valor2){
            double dif = valor1-valor2;
            JOptionPane.showMessageDialog(null, "A diferença de "+valor1+ " e "+valor2+" é " + dif);
        }else{
            if(valor2>=valor1){
                double dif = valor2-valor1;
                 JOptionPane.showMessageDialog(null, "A diferença de "+valor2+ " e "+valor1+" é " + dif);
            }
        }
    }
}
