/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Faculdade {

    private String nome;
    private Integer vagas;
    private List<Aluno> alunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.alunos = new ArrayList<>();
    }
    
    public Integer getTotalVagas() {
        return vagas;
    }

    public void matricularAluno(Aluno aluno) {
        if (this.vagas != null) {
            alunos.add(aluno);
        }
    }
 
    public void exibirAlunosMatriculados() {
        if (alunos.isEmpty()) {
            System.out.println("A faculdade nao possui alunos cad.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void exibirAlunosPos() {
        if (alunos.isEmpty()) {
            System.out.println("A faculdade nao possui alunos cad.");
        } else {
            for (Aluno aluno : alunos) {
                if (aluno instanceof AlunoPos) {
                    System.out.println(aluno);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + "vagas atuais: " +
                (vagas-alunos.size()) + ", alunos=" + alunos + '}';
    }

}
