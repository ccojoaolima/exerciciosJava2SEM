/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoheranca;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Departamento {
    private List<VendedorComissao> vendedores;

    //se o seu objetivo nao for receber uma lista, nao peca uma!
    public Departamento() {
        this.vendedores = new ArrayList();
    }
    
    public void adicionarVendedor(VendedorComissao vendedor){
        if( vendedor != null){
         vendedores.add(vendedor);
        }
       
    }
    
    public void exibirTodos(){
        for (VendedorComissao vendedor : vendedores) {
            System.out.println(vendedor);
        }
    }
    public Double calcularTotalSalario(){
        Double total = 0.0;
        for (VendedorComissao vendedor : vendedores) {
                total += vendedor.calcularSalario();
        }
        return total;
    }
}
