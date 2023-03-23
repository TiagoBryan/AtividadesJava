/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionario4;

import javax.swing.JOptionPane;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Questionario4 {

    public static void main(String[] args) {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da opção desejada no menu: \n"
                + "1 - Soma \n"
                + "2 - Subtração \n"
                + "3 - Divisão \n"
                + "4 - Multiplicação \n"
                + "5 - Resto da Divisão \n"
                + "6 - Dobro \n"
                + "7 - Quadrado \n"
                + "8 - Cubo \n"
                + "9 - Raiz Quadrada \n"
                + "0 - Sair \n"));
        if(op==0) {
            System.exit(0);
        }else{
            if((op > 9) || (op<0)){
                 JOptionPane.showMessageDialog(null, "Opação invalida, tente novamente");
                System.exit(0);
            }else{
                
              int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números que voce gostaria de calcular: "));
              double numeros[] = new double[qtd];
              for(int i = 0; i<qtd; i++){
                  numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+"° número: "));
                  
              }
              calcularop(op, numeros);
            }  
        }
        
    }
    static void calcularop (int opcao, double[] num){
        
        switch(opcao){
            case 1:
                double soma = 0;
                
               for(int i = 0; i < num.length; i++) {
                   soma += num[i];
               }
               JOptionPane.showMessageDialog(null, "A soma de todos os números foi "+ soma);
               break;
            case 2:
                double subtracao = num[0];
                
               for(int i = 1; i<num.length; i++) {
                   subtracao -= num[i];
               }
               JOptionPane.showMessageDialog(null, "A subtracao de todos os números foi "+ subtracao);
               break;
            case 3:
                double divisao = num[0];
                
               for(int i = 1; i<num.length; i++) {
                   divisao /= num[i];
               }
               JOptionPane.showMessageDialog(null, "A divisao de todos os números foi "+ divisao);
               break;
            case 4:
                double multiplicacao = num[0];
                
               for(int i = 1; i<num.length; i++) {
                   multiplicacao *= num[i];
               }
               JOptionPane.showMessageDialog(null, "A multiplicacao de todos os números foi "+ multiplicacao);
               break;
            case 5:
                double restdiv = num[0];
                if(num.length>2){
                     for(int i = 1; i<((num.length)-1); i++) {
                   restdiv /= num[i];
                    }
                     int i = (num.length)-1;
                     restdiv %= num[i];
                }else{
                    restdiv %= num[1];
                }
              
               JOptionPane.showMessageDialog(null, "O resto da divisão de todos os números foi "+ restdiv);
               break;
            case 6:
                double dobro[] = new double[num.length];
                for(int i = 0; i < dobro.length; i++){
                    dobro[i] = num[i]*2;
                    JOptionPane.showMessageDialog(null, "O dobro de "+ num[i] +" é "+ dobro[i]);
                }
               
               break;
            case 7:
                double quadrado[] = new double[num.length];
                for(int i = 0; i < quadrado.length; i++){
                    quadrado[i] = num[i]*num[i];
                    JOptionPane.showMessageDialog(null, "O "+ num[i] +" elevado ao quadrado é "+ quadrado[i]);
                }
               
               break;
            case 8:
                double cubo[] = new double[num.length];
                for(int i = 0; i < cubo.length; i++){
                    cubo[i] = num[i]*num[i]*num[i];
                    JOptionPane.showMessageDialog(null, "O "+ num[i] +" elevado ao cubo é "+ cubo[i]);
                }
               
               break;
            case 9:
                double raiz[] = new double[num.length];
                for(int i = 0; i < raiz.length; i++){
                    raiz[i] = Math.sqrt(num[i]);
                    JOptionPane.showMessageDialog(null, "A raiz quadrada de "+ num[i] +" é "+ raiz[i]);
                }
               
               break;
        }
    }
}
