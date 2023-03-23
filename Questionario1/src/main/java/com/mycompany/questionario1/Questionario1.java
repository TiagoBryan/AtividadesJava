/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionario1;

import javax.swing.JOptionPane;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Questionario1 {

    public static void main(String[] args) {
        lerNota();
    }
    
    static void lerNota(){
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota: "));
        double media = calcularMedia( nota1,  nota2);
        if(media >= 7){
            JOptionPane.showMessageDialog(null, "Olá, "+nome+", você foi aprovado com média "+ media);
        }else{
            JOptionPane.showMessageDialog(null, "Olá, "+nome+", você foi reprovado com média "+ media);
        }
        
    }
    static double calcularMedia(double n1, double n2){
        double m = (n1+n2)/2;
        return m; 
    }
}
