/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Bolo {
    String saborBolo = "";
    Double valorBolo = 0.0;
    Integer quantidadeDisponivel = 100;
    Integer quantidadeVendida;
    Double valorTotal = 0.0;
    
    
    void comprarBolo(){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Qual a quantidade de bolos necessária?");
    quantidadeVendida = leitor.nextInt();
    if(quantidadeVendida > 100){
    System.out.println("Seu pedido ultrapassou a qtd. disponível p/ esse bolo");
    }else{
    quantidadeDisponivel = quantidadeDisponivel - quantidadeVendida;
    valorTotal = quantidadeVendida * valorBolo;
    }
    }
    
    void exibirRelatorio(){
        System.out.println("O bolo sabor " + saborBolo +  " foi comprado " 
                + quantidadeVendida + " hoje, totalizando R$" + valorTotal);
    }
    
    
}
