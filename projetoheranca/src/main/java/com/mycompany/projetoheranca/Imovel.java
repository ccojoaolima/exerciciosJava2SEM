/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoheranca;

/**
 *
 * @author aluno
 */
public class Imovel {
    private Double preço;
    protected String endereço;

    public Double getPreço() {
        return preço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Imovel(Double preço, String endereço) {
        this.preço = preço;
        this.endereço = endereço;
    }
    
    public Double getPreçoVenda(){
        return this.preço;
    }

    @Override
    public String toString() {
        return String.format("nome: %s \n preço: %.2f", this.endereço, this.preço);
    }
    
    
}
