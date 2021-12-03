/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.heroi;

/**
 *
 * @author aluno
 */
public class Confronto {

    public static void lutar(Heroi heroi, VIlao vilao) {
        Double forcaTotalHeroi = heroi.getForcaTotal();
        Double forcaTotalVilao = vilao.getForcaTotal();

        if (forcaTotalHeroi > forcaTotalVilao) {
            System.out.println("O Heroi " + heroi.getNome() + "Vence sobre as forças do mal");
        }else if(forcaTotalVilao > forcaTotalHeroi) {
            System.out.println("O implacável " + vilao.getNome() + "Triunfa!");
        }else{
            System.out.println("Um empate! A guerra de atrito não deu frutos.");
        }

    }

}
