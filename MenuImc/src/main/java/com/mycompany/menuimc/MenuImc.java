/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuimc;

/**
 *
 * @author Admin
 */
public class MenuImc {
    private Imc imc;
    private Integer opcao;
    private ConversorNumeros conversor;
    private entradaSaidaDados io;
    
    public void ExecutarImc(){
        this.imc = new Imc();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new entradaSaidaDados();
    }

    private void executarMenuPrincipal(){
            String mensagemMenu = "Selecione uma opção"
            +"\n 1 - Calcular IMC"
            +"\n 5 - Sair";
    
    String entradaDados = io.entradaDados(mensagemMenu);
    this.opcao = conversor.StringToInt(entradaDados);
    }
    private void avaliarOpcaoEscolhida(){
            String saida;
            double num1 = 0, num2 = 2;
    if(this.opcao != 0 && this.opcao <= 4){
        String mensagemEntrada = "Digite o 1° número";
        num1 = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
        imc.setNumero01(num1);
        mensagemEntrada = "Digite o 2° número";
        num2 = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
        imc.setNumero02(num2);
    }
        switch (this.opcao) {
            case 1:
            imc.somar(num1, num2);
            saida = "Resultado da Soma: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                
            case 2:
          imc.subtrair(num1, num2);
            saida = "Resultado da Subtração: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                case 3:
          imc.multiplicar(num1, num2);
            saida = "Resultado da Multiplicação: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                 case 4:
          imc.dividir(num1, num2);
            saida = "Resultado da Divisão: " + calculadora.getResultado();
            io.saidaDados(saida);
                break;
                case 5:
          imc.sair();
                break;
            default:
                io.saidaDados("Opção Invalida");
                break;
        }
    }
    }
    
}


