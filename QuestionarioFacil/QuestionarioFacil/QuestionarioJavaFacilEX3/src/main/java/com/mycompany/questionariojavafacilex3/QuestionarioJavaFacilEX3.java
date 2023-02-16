/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojavafacilex3;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJavaFacilEX3 {

    public static void main(String[] args) {
        int[] numeros = new int [15];
        int numtrinta = 0;
        Scanner input = new Scanner(System.in);
        
        
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite os quinze números em sequencia, um por vez: ");
            numeros[i] = input.nextInt();
        
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 30) {
                numtrinta++;
            } 
        }
        System.out.println("Foram digitados " + numtrinta + " numeros maiores que 30");
    }
}
