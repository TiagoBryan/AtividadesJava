/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4_05_23;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dti
 */
public class funcao_interfaceGrafica extends JFrame{
    JLabel rotulo1, rotulo2, exibir, rotulo3, rotulo4;
    JTextField texto1, texto2, raizq;
    JButton somar, subtrair, dividir, multiplicar, raiz;
    public funcao_interfaceGrafica(){
        super("Exemplo de Soma");
        Container tela = getContentPane();
        setLayout(null);
        somar = new JButton ("Somar");
        subtrair = new JButton ("Subtrair");
        dividir = new JButton ("Dividir");
        multiplicar = new JButton ("Multiplicar");
         raiz = new JButton ("Raiz Quadrada");
        rotulo1 = new JLabel("1º Número");
        rotulo3 = new JLabel("Calcular Raiz Quadrada");
        rotulo2 = new JLabel("2º Número");
        rotulo4 = new JLabel("+");
        raizq = new JTextField(5);
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        rotulo4.setBounds(100, 80, 120, 20);
        exibir = new JLabel("");
        raiz.setBounds(150,270, 80, 20);
        somar.setBounds(150, 150, 80, 20);
        multiplicar.setBounds(150, 210, 80, 20);
        subtrair.setBounds(150, 180, 80, 20);
        dividir.setBounds(150, 240, 80, 20);
         rotulo1.setBounds(50, 20, 100, 20);
         raizq.setBounds(190, 100, 100, 20);
         rotulo3.setBounds(40, 100, 150, 20);
          rotulo2.setBounds(50, 60, 100, 20);
           texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            //exibir.setBounds(150, 250, 200, 20);
            
        somar.addActionListener( 
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     int numero1, numero2, soma;
                    soma= 0; 
                    
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                
                    soma = numero1 + numero2;
              
                    exibir.setVisible(true);
                            //exibir.setText("A soma é " +soma);
                           JOptionPane.showMessageDialog(null, "A soma é " +soma);
                        }
        });
        subtrair.addActionListener( 
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     int numero1, numero2, subtrair;
                     subtrair=0;
                    
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    subtrair = numero1 - numero2;
                 
                    exibir.setVisible(true);
                        
                            //exibir.setText("A subtração é " +subtrair);
                            JOptionPane.showMessageDialog(null, "A subtração é " +subtrair);
                        }
        });
        multiplicar.addActionListener( 
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     int numero1, numero2, multiplicar;
                     multiplicar=0;
                    
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    multiplicar = numero1 * numero2;
                 
                    exibir.setVisible(true);
                        
                            //exibir.setText("A multiplicação é " +multiplicar);
                             JOptionPane.showMessageDialog(null, "A subtração é " +multiplicar);
                        }
        });
        dividir.addActionListener( 
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     int numero1, numero2, dividir;
                     dividir=0;
                    
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    dividir = numero1 / numero2;
                 
                    exibir.setVisible(true);
                        
                            //exibir.setText("A divisão é " +dividir);
                            JOptionPane.showMessageDialog(null, "A divisão é " +dividir);
                        }
        });
        raiz.addActionListener( 
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     
                     double raiz, numero3;
                     raiz=0;
                    
                    raiz = Integer.parseInt(raizq.getText());
                   
                    raiz = Math.sqrt(raiz);
                 
                    exibir.setVisible(true);
                        
                            //exibir.setText("A Raiz quadrada é " +raiz);
                            JOptionPane.showMessageDialog(null, "A Raiz quadrada é " +raiz);
                        }
        });
      exibir.setVisible(false);
        tela.add(somar); tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3);tela.add(rotulo4);
        tela.add(texto1); tela.add(texto2); tela.add(exibir);
        tela.add(dividir); tela.add(multiplicar); tela.add(subtrair); tela.add(raizq); tela.add(raiz);
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String args[]){
        funcao_interfaceGrafica app = new funcao_interfaceGrafica();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
