/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionariojavaex6;

import java.util.Scanner;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class QuestionarioJavaEX6 {

    public static void main(String[] args) {
        int[] qtd = new int[5]; 
        double[] preco = new double[5]; 
        double faturamento = 0;

        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a quantidade da mercadoria " + (i+1) + ": ");
            qtd[i] = scanner.nextInt();
            System.out.print("Digite o preço da mercadoria " + (i+1) + ": ");
            preco[i] = scanner.nextDouble();
        }

        
        for (int i = 0; i < 5; i++) {
            faturamento += qtd[i] * preco[i];
        }

       
        System.out.println("Faturamento mensal: R$" + faturamento);
    
    }
}
