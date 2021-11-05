/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.imovel;

/**
 *
 * @author Aluno
 */
public class imovel {
    protected Double preco;
    protected String endereco;

    public imovel(Double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }

    public Double getPreco() {
        return preco;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public Double getPrecoVenda(){
       return preco;
    }

    @Override
    public String toString() {
        return "Imovel preço base: " + this.preco + "Endereço : "+this.endereco;
    }
    
    
}
