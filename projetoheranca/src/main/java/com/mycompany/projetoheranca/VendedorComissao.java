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
public class VendedorComissao {
    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    public Double calcularSalario(){
        return this.vendas*(this.taxa/100);
    }

    @Override
    public String toString() {
        return "VendedorComissao{" + "codigo=" + codigo + ", nome=" + nome + ", vendas=" + vendas + ", taxa=" + taxa + '}';
    }
    
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    
}
