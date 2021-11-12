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
public class VendedorComissaoMaisFixo extends VendedorComissao{
    private Double salarioFixo;
   
    public VendedorComissaoMaisFixo
        (Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }
         
    public Double calcularSalario(){
        return super.calcularSalario()+this.salarioFixo;
    }


    @Override
    public String toString() {
        return "\nsalario fixo "+this.salarioFixo+"\ncodigo "+super.getCodigo()+
                "\nnome "+super.getNome()+"\nvendas "+super.getVendas()+"\ntaxa "+super.getTaxa();
    }
    
    
}
