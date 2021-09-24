/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.encapsulamento;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String curso;
    private String nome;
    private String ra;
    private Double nota1;
    private Double nota2;
    
    public Aluno(String ra, String nome, String curso){
    this.ra = ra;
    this.nome = nome;
    this.curso = curso;
    this.nota1 = 0.0;
    this.nota2 = 0.0;
    }

    //comeco dos getters
    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }
    
    public Double getMedia(){
        return ((nota1+nota2)/2);
    }

    
    
    //comeco dos setters
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        String texto = "Nome:%s, Nota 01: %.1f, Nota 02: %.1f, Media: %.1f";
        
        return String.format(texto, this.nome,
                                    this.nota1,
                                    this.nota2,
                                    this.getMedia());
    }
    
}   
