/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.heroi;


public class Heroi extends Personagem{

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
       Double forcaTotalHeroi = 0.0;
        for (SuperPoder poder : poderes) {
            forcaTotalHeroi += (poder.getCategoria())*1.15;
        }
        return forcaTotalHeroi;
    }
    
}
