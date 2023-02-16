/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojava;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJava {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int numpares = 0;
        int simpar = 0;
        
        Scanner input = new Scanner(System.in);
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o seus dez números em sequencia, um por vez: ");
            numeros[i] = input.nextInt();
        }
        
       
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numpares++;
            } else {
                simpar += numeros[i];
            }
        }
        
        System.out.println("Quantidade de números pares: " + numpares);
        System.out.println("Soma dos números ímpares: " + simpar);
    }
    }

