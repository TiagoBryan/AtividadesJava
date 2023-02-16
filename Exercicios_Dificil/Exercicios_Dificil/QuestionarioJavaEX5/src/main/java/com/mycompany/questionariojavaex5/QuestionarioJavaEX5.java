/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojavaex5;


import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJavaEX5 {

    public static void main(String[] args) {
       
       char[] vogais = new char[10];
        int[] quantidades = new int[5]; 
        double[] porcentagens = new double[5]; 
        int totalVogais = 0;

       
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vogais.length; i++) {
            System.out.print("Digite as suas cinquenta vogais em sequencia, um por vez: ");
            vogais[i] = scanner.next().toUpperCase().charAt(0);
            if (vogais[i] != 'A' && vogais[i] != 'E' && vogais[i] != 'I' && vogais[i] != 'O' && vogais[i] != 'U') {
                System.out.println("Por favor, digite uma vogal válida (A, E, I, O ou U)");
                i--; // volta para a posição anterior para tentar novamente
            }
        }

        
        for (int i = 0; i < vogais.length; i++) {
            switch (vogais[i]) {
                case 'A': quantidades[0]++; break;
                case 'E': quantidades[1]++; break;
                case 'I': quantidades[2]++; break;
                case 'O': quantidades[3]++; break;
                case 'U': quantidades[4]++; break;
            }
        }
        totalVogais = vogais.length;
        for (int i = 0; i < porcentagens.length; i++) {
            porcentagens[i] = ((double)quantidades[i] / totalVogais) * 100;
        }

       
        for (int i = 0; i < quantidades.length; i++) {
            System.out.println("Quantidade de " + (char)('A'+i) + ": " + quantidades[i]);
            System.out.println("Porcentagem de " + (char)('A'+i) + ": " + porcentagens[i] + "%");
        }
    
    }
}
