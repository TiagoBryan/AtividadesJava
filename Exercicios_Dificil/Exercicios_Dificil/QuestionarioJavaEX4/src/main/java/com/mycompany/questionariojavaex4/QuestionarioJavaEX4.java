/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojavaex4;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJavaEX4 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        long[] fatoriais = new long[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            
        System.out.println("Digite sues dez números em seguida, um por vez, para calcular o fatorial: ");
        numeros[i] = input.nextInt();
        
        }
        for(int i = 0; i < numeros.length; i++){
        
            fatoriais[i] = calcularFatorial(numeros[i]);
        
        }
        for (int i = 0; i < fatoriais.length; i++) {
            System.out.println("Fatorial de " + numeros[i] + " é igual a " + fatoriais[i]);
        }
    }

    private static long calcularFatorial(int num) {
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    }

