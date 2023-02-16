/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojavaex2;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJavaEX2 {

    public static void main(String[] args) {
        double[] numeros = new double[100];
        double m = 0;
        double soma = 0;
        int qtdmm = 0;

        Scanner input = new Scanner(System.in);

       
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o seus cem números em sequencia, um por vez: ");
            numeros[i] = input.nextDouble();
            if (numeros[i] < 0) {
                System.out.println("Não digite números negativos.");
                i--;
            } else {
                soma += numeros[i];
            }
        }

       
        
        m = soma / numeros.length;

     
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > m) {
                qtdmm++;
            }
        }

        System.out.println("Média dos valores: " + m);
        System.out.println("Quantidade de valores acima da média: " + qtdmm);
    }
}
