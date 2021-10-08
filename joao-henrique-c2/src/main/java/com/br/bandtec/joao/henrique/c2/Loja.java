/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.joao.henrique.c2;

/**
 *
 * @author Aluno
 */
public class Loja {
    private String nome = "";
    private Integer quantidadeJogosVendidos =0;
    private Integer quantidadeDescontosAplicados = 0;
    private Double totalFaturado = 0.0;

    public Loja(String nome) {
        this.nome = nome;
        this.quantidadeJogosVendidos = 0;
        this.quantidadeDescontosAplicados = 0;
        this.totalFaturado = 0.0;
    }

    public void cadastrarEstoque(Jogo jogo, Integer novoEstoque){
    //Integer novoEstoque = 0;
    nome = jogo.getNome();
    jogo.setEstoque(novoEstoque);
    
        System.out.println(String.format("O estoque do jogo %s foi alterado", nome));
    }
    
    public void realizarVenda(Jogo jogo){
    Double valorVenda = 0.0;
    nome = jogo.getNome();
    valorVenda = jogo.getPreco();
    
    if(jogo.getEstoque() >= 1){
    quantidadeJogosVendidos++;
    totalFaturado += valorVenda;
    jogo.setEstoque(jogo.getEstoque()- 1);
    
        System.out.println(String.format("Realizando venda sem desconto: \n"
                + "Nome: %s \n"
                + "Genero: %s\n"
                + "Preço: %.2f \n"
                + "Estoque: %d", nome,jogo.getGenero(),jogo.getPreco(),
                jogo.getEstoque()));
    } else{
        System.out.println("Operação inválida!");
    }
    
    }
    
    
    @Override
    public String toString() {
        return String.format("Loja %s \n"
                        + "Quantidade Vendida: %d \n"
                        + "Descontos aplicados: %d \n"
                        + "Total Faturado: %.2f", nome, quantidadeJogosVendidos, 
                        quantidadeDescontosAplicados,totalFaturado);
    }
    
    
    
    
}
