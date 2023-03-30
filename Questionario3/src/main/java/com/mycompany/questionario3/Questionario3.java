/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionario3;

import javax.swing.JOptionPane;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Questionario3 {

    public static void main(String[] args) {
        int sub = 0;
        int soma =0;
        int sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' se você for do sexo masculino ou '2' para feminino"));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        if((sexo > 2) || (sexo<1)){
            JOptionPane.showMessageDialog(null, "Opção invalida");
            System.exit(0);
        }else{
        float alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura em metros"));
        float pi = calcularPesoIdeal(sexo, alt, idade);
        if((idade >=20) && (idade<=59)){
            soma = 7;
            sub = 11;
        }else{
            if(idade< 20){
                soma = 3;
             sub = 16;
            }else{
                soma = 12;
             sub = 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Seu peso ideal deve estar entre "+ (pi+soma) +"KG e "+(pi-sub));}
    }
    static float calcularPesoIdeal(int s, float altura, int id){
        float pesoideal;
        float pesoideal2;
        if(s == 1){
            
             pesoideal = ((float) (72.7 * altura)-58);
             pesoideal2 = ((float) (72.7 * altura)-58);
            return pesoideal;
            
        }else{
            if(s == 2){
                pesoideal = (float) ((float) (62.1 * altura)-44.7);
                return pesoideal;
            }
        }
        return 0;
    }
}
