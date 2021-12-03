/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.heroi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public abstract class Personagem {
  
    
    private String codinome;
    private String nome;
    protected List <SuperPoder> poderes = new ArrayList<>();

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
    }
    
    public void adicionaPoder(String nome, Integer categoria){
    SuperPoder superpower = new SuperPoder(nome,categoria);
    poderes.add(superpower);
    }
    
    public abstract Double getForcaTotal();

    public String getCodinome() {
        return codinome;
    }

    public String getNome() {
        return nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }

    @Override
    public String toString() {
        return "Personagem{" + "codinome=" + codinome + ", nome=" + nome + ", poderes=" + poderes + '}';
    }
    
    
    
}
