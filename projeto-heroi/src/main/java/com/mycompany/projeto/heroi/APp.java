/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.heroi;

/**
 *
 * @author aluno
 */
public class APp {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Gustavo Righetti", "Gustavo Righetti");
        Heroi heroi2 = new Heroi("Peter parker", "batman do futuro");
        VIlao vilao1 = new VIlao("Arquito", "arquito");
        VIlao vilao2 = new VIlao("Lex Luthor", "Lex Luthor");
        heroi1.adicionaPoder("Bafo de fogo", 2);
        vilao1.adicionaPoder("8 trigramas 63 golpes", 1000);
        
        Confronto.lutar(heroi1, vilao1);
        Confronto.lutar(heroi2, vilao2);
    }
}
