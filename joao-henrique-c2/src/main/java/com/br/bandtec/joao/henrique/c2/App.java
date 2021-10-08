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
public class App {
    public static void main(String[] args) {
    Jogo jogo1 = new Jogo("Bom de guerra", "Aventura",23.22);
    Jogo jogo2 = new Jogo("League of legends", "MOBA", 999.99);
    Loja loja1 = new Loja("League of legends");
    
    jogo1.toString();
    jogo2.toString();
    
    loja1.realizarVenda(jogo1);
    
    loja1.cadastrarEstoque(jogo1, 200);
    loja1.cadastrarEstoque(jogo2, 200);
    
    loja1.realizarVenda(jogo1);
    loja1.realizarVenda(jogo2);
    
    jogo1.toString();
    jogo2.toString();
    
     System.out.println(loja1.toString());
    
    
    }
    
    
  
    
}
