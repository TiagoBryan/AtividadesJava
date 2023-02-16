/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojavaex3;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJavaEX3 {

    public static void main(String[] args) {
        int[] numeros = new int[50];
        int MAvalor = 0;
        int MEvalor = Integer.MAX_VALUE;
        int PMAvalor = 0;
        int PMEvalor = 0;

        Scanner input = new Scanner(System.in);

       
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o seus cinquenta números em sequencia, um por vez: ");
            numeros[i] = input.nextInt();
            if (numeros[i] < 0) {
                System.out.println("Não digite números negativos.");
                i--;
            } else {
                
                if (numeros[i] > MAvalor) {
                    MAvalor = numeros[i];
                    PMAvalor = i;
                }
             
                if (numeros[i] < MEvalor) {
                    MEvalor = numeros[i];
                    PMEvalor = i;
                }
            }
        }

        System.out.println("Maior valor: " + MAvalor + " (posição " + PMAvalor + ")");
        System.out.println("Menor valor: " + MEvalor + " (posição " + PMEvalor + ")");
        }
}
