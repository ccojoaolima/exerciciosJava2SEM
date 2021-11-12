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
public class Professor {

    protected Integer codigo;
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Professor(Integer codigo, String nome, Integer qtdHoras, Double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Double calculaSalario() {
        Double salarioProf = 0.0;

        salarioProf = (this.qtdHoras * valorHora) * 4.5;
        return salarioProf;
    }

    @Override
    public String toString() {
        return "Professor{" + "codigo=" + codigo + ", nome=" + 
                nome + ", qtdHoras=" + qtdHoras + ", valorHora=" + valorHora 
                + "salarioprof" + calculaSalario() + '}';
    }
    
    

}
