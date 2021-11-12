/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciop.professor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Faculdade {
    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<>();
    }
    
    public void contratarProfessor(Professor p){
    if(professores.size() > this.vagas){
        System.out.println("Não ha mais vagas");
    }else{
        this.professores.add(p);
    }
    }
    

    public void exibirProfessor(){
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + ", professores=" + professores + '}';
    }
    
    
    
    
    }
    
    
            
    
    

