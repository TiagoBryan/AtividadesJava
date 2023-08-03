/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucalculadora;

/**
 *
 * @author Admin
 */
public class MenuCalculadora {
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    public MenuCalculadora(){
    this.calculadora = new Calculadora();
    this.opcao = -1;
    this.conversor = new ConversorNumeros();
    this.io = new EntradaSaidaDados();
    }
    public void executarCalculadora(){
        do{
        this.executarMenuPrincipal();
        this.avaliarOpcaoEscolhida();
        }  while(this.opcao!=0);
 }
    private void executarMenuPrincipal(){
    String mensagemMenu = "Selecione uma opção"
            +"\n 1 - Somar"
            +"\n 2 - Subtrair"
            +"\n 3 - Multiplicar"
            +"\n 4 - Dividir"
            +"\n 5 - Sair";
    
    String entradaDados = io.entradaDados(mensagemMenu);
    this.opcao = conversor.StringToInt(entradaDados);
    }
    public void avaliarOpcaoEscolhida(){
    String saida;
    double num1 = 0, num2 = 2;
    if(this.opcao != 0 && this.opcao <= 4){
        String mensagemEntrada = "Digite o 1° número";
        num1 = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
        calculadora.setNumero01(num1);
        mensagemEntrada = "Digite o 2° número";
        num2 = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
        calculadora.setNumero02(num2);
    }
        switch (this.opcao) {
            case 1:
            calculadora.somar(num1, num2);
            saida = "Resultado da Soma: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                
            case 2:
          calculadora.subtrair(num1, num2);
            saida = "Resultado da Subtração: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                case 3:
          calculadora.multiplicar(num1, num2);
            saida = "Resultado da Multiplicação: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                 case 4:
          calculadora.dividir(num1, num2);
            saida = "Resultado da Divisão: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                case 5:
          calculadora.sair();
                break;
            default:
                io.saidaDados("Opção Invalida");
                break;
        }
    }
}