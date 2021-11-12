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
public class App {
    public static void main(String[] args) {
        Imovel i1 = new Imovel(1000.0, "Rua normal");
        ImovelUsado i2 = new ImovelUsado(1000.0, "Rua Veia");
        ImovelNovo i3 = new ImovelNovo(1000.0, "Rua chique");
        
        System.out.println(i1.toString());
        System.out.println(i2.toString());
        System.out.println(i3.toString());
        
                
        System.out.println("-".repeat(20));
        
        VendedorComissao v1 = new VendedorComissao(1, "jaehyun", 100.0, 0.15);
        VendedorComissaoMaisFixo v2 = new VendedorComissaoMaisFixo(1000.0, 2, "johnny", 100.0, 0.15);
        
        System.out.println(v1.calcularSalario());
        System.out.println(v2.calcularSalario());
        
    }
    
}
