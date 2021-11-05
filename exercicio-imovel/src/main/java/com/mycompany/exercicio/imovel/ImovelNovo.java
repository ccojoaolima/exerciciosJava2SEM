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
public class ImovelNovo extends imovel{
    
    public ImovelNovo(Double preco, String endereco) {
        super(preco, endereco);
    }

    @Override
    public Double getPrecoVenda() {
        preco = preco *1.1;
        return preco; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Preço (com acréscimo de imovel novo):" + this.preco;
    }
    
    
    
}
