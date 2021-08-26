/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista2.nivelamento.joaoh;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Loteria {
    public static void main(String[] args) {
        Integer nroSorteado;
        
        Integer numeroTentativas = 0;
        Integer gerador = ThreadLocalRandom.current().nextInt(0,11);
      
        Scanner leitorNro = new Scanner(System.in);
        System.out.println("Digite um numero entre 0 e 10: ");
        nroSorteado = leitorNro.nextInt();
        System.out.println("Numero gerador: " + gerador);
      
        
        while (nroSorteado != gerador) {    
           numeroTentativas++;
           gerador = ThreadLocalRandom.current().nextInt(0,11);
            System.out.println("Nro tentativas: " + numeroTentativas);
            System.out.println("Teste: " + gerador);
           
        
            
        }   if(numeroTentativas <= 3){
               System.out.println("B");
           }
           
    
            
            
            
        }
    
}
