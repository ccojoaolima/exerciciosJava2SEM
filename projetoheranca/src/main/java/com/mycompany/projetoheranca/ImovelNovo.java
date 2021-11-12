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
public class ImovelNovo extends Imovel{
    public Double getPreçoVenda(){
        return super.getPreçoVenda()+(super.getPreço()*0.1);
    }

    public ImovelNovo(Double preço, String endereço) {
        super(preço, endereço);
    }

    @Override
    public String toString() {
        return String.format("\n NOVO \nnome: %s \n preço: %.2f", this.endereço, this.getPreçoVenda());
    }
    
}
