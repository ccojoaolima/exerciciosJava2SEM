/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.exercicio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Conta {
    private String nomeTitular;
    private Double valorConta;

    public Conta(String nomeTitular, Double valorConta) {
        this.nomeTitular = nomeTitular;
        this.valorConta = valorConta;
    }
    

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getValorConta() {
        return valorConta;
    }

    public void setValorConta(Double valorConta) {
        this.valorConta = valorConta;
    }
    
    void sacar(){
    Scanner in = new Scanner(System.in);
    System.out.println("Digite o valor de saque desejado?");
    Double valorSaqueDigitado = in.nextDouble();
    setValorConta(valorConta - valorSaqueDigitado);
    
    if(valorSaqueDigitado > 200 || valorSaqueDigitado > valorConta){
    System.out.println("Valor de Saque Inválido");
    }
    }
    
    void depositar(){
    Scanner in = new Scanner(System.in);
    System.out.println("Digite o valor de depósito desejado: ");
    Double valorDepositoDigitado = in.nextDouble();
    setValorConta(valorConta + valorDepositoDigitado);
    }
    
    void verificarDetalhesDaConta(){
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Saldo atual: " + valorConta);
    }
    
    void verificarConta(){
    String situacaoFinanceira = "";
    
    System.out.println("Saldo atual: " + valorConta);
    
    if(valorConta > 100){
    situacaoFinanceira = "Bom";
    }else if(valorConta >=50 && valorConta<100){
    situacaoFinanceira = "Regular";
    }else{
    situacaoFinanceira = "Ruim";
    }
    System.out.println("Situação Financeira: " + situacaoFinanceira);
    }
    
}
