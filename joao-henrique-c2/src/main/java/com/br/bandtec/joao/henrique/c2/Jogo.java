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
public class Jogo {
    private String nome = "";
    private String genero = "";
    private Integer estoque = 0;
    private Double preco = 0.0;

    public Jogo(String nome, String genero,Double preco) {
        this.nome = nome;
        this.genero = genero;
        this.estoque = 0;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Nome do jogo: %s \n"
                + "Genero: %s \n"
                + "Preço: R$ %.2f\n"
                + "Estoque: %d", nome, genero, preco, estoque);
    }
    
    

    

    



}
