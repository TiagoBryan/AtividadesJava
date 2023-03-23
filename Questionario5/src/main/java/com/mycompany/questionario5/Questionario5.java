/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionario5;

import javax.swing.JOptionPane;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Questionario5 {

    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        double alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        double hip = hipotenusa(base, alt);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é "+hip);
    }
    static double hipotenusa(double b, double h){
        double hipq = (b*b)+(h*h);
        double hipotenusa = Math.sqrt(hipq);
        return hipotenusa;
    }
}
