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
public class VIlao extends Personagem {

    public VIlao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double forcaTotalVilao = 0.0;

        for (SuperPoder poder : poderes) {
            forcaTotalVilao += poder.getCategoria();
        }

        return forcaTotalVilao;
    }

}
