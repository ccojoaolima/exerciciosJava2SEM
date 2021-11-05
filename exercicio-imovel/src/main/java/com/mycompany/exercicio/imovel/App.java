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
public class App {
    public static void main(String[] args) {
        imovel imovel1 = new imovel(22.2, "Rua A");
        ImovelNovo imovelNovo1 = new ImovelNovo(22.2, "Rua B");
        ImovelUsado imovelUsado1 = new ImovelUsado(22.2, "Rua A");
        
        System.out.println(imovel1.getPrecoVenda());
        System.out.println(imovelNovo1.getPrecoVenda());
        System.out.println(imovelUsado1.getPrecoVenda());
        
    }
}
