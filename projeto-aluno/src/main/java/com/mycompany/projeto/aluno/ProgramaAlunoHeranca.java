/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.aluno;

/**
 *
 * @author aluno
 */
public class ProgramaAlunoHeranca {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(22, "joao", 2.2, 5.5);
        System.out.println("O aluno" + a1.nome + "tem media" + a1.calculaMedia());
        
        Faculdade f1 = new Faculdade("bandtec", 222);
        System.out.println(a1);
        f1.matricularAluno(a1);
        
        System.out.println(f1);
    }
} 
