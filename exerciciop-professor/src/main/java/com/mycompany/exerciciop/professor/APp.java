/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciop.professor;

/**
 *
 * @author aluno
 */
public class APp {
    public static void main(String[] args) {
        Professor p1 = new Professor(1, "Rlly Felps", 12, 4.50);
        System.out.println(p1);
        
        Coordenador c1 = new Coordenador("pedrao", 12, 15, 5.50, "CCO", 1, 12, 4.45);
        System.out.println(c1);
        
        Faculdade f1 = new Faculdade("Bandtec", 100);
        f1.contratarProfessor(p1);
        f1.exibirProfessor();
        
    }
}
