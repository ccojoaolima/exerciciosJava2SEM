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
public class Coordenador extends Professor{
    private String nome;
    private Integer vagas;

   private Integer qtdHorasCoord;
   private Double valorHoraCoord;
   private String curso;

    public Coordenador(String nome, Integer vagas, Integer qtdHorasCoord, Double valorHoraCoord, String curso, Integer codigo, Integer qtdHoras, Double valorHora) {
        super(codigo, nome, qtdHoras, valorHora);
        this.nome = nome;
        this.vagas = vagas;
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   
    public Double calculaSalario(){
    Double salarioCoord = 0.0;
    salarioCoord = ((this.qtdHoras * this.valorHora) * 4.5)
    + ((this.qtdHorasCoord * this.valorHoraCoord)*4.5);
    return salarioCoord;
    }

    @Override
    public String toString() {
        return "Coordenador{" + "nome=" + nome + ", curso=" + 
                curso + "salariocoord" + calculaSalario() + '}';
    }
    
    
    
}
   

    

