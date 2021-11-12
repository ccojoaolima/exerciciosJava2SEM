/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoheranca;

/**
 *
 * @author aluno
 */
public class AlunoGraduacao extends Aluno{
    private Double notaIntegrada;
    private Double notaContinuada;

    public AlunoGraduacao(String nome, Integer ra) {
        super(nome, ra);
        this.notaContinuada = 0.0;
        this.notaIntegrada = 0.0;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" + "notaIntegrada=" + notaIntegrada + 
                ", notaContinuada=" + notaContinuada +", nome="+ this.nome + ", ra=" +super.getRa()+'}';
    }
    
    
}
