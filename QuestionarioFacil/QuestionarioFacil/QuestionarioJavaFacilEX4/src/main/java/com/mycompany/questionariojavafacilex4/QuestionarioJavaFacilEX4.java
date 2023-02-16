/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojavafacilex4;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJavaFacilEX4 {

    public static void main(String[] args) {
        int[] numeros = new int [15];
        int i = 0;
        int numentre = 0;
        Scanner input = new Scanner(System.in);
        
        while(i < numeros.length){
            System.out.print("Digite os quinze números em sequencia, um por vez: ");
            numeros[i] = input.nextInt();
            if((numeros[i] <= 200) && (numeros[i] >= 100) ){
                numentre++;
            
            }else{
                if(numeros[i] == 0){
                    System.exit(0);
                }
            }
            i++;
            
        }
        System.out.print("Foram digitados "+ numentre + " numeros que estão entre 100 e 200");
    }
}
