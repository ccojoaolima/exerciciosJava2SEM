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
public class AlunoPos extends Aluno{
    private Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
    }

   /* public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }*/
    
    public Double calculaMedia(){
    Double mediaAluno = 0.0;
    mediaAluno = (this.notaContinuada + this.notaSemestral + notaMonografia)/3;
   
    return mediaAluno;
    }

    @Override
    public String toString() {
    return super.toString() + 
            "AlunoPos{" + "notaMonografia=" + 
            notaMonografia + '}';
    }
    
    
    
    
}
