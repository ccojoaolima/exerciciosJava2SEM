/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista2.joaoh;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class ExSorteio {
    public static void main(String[] args) {
        Scanner leitorNro = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 100");
        Integer nroDigitado = leitorNro.nextInt();
        
     
        Integer nroGerado;
        Integer rodadaEncontrada = 0;
        Integer nrosPares = 0;
        Integer nrosImpares = 0;
        Integer rodada = 0;
        Integer nroEncontrado = 0;
        
        System.out.println("Sorteios\n");
        for (int i = 0; i <= 200; i++) {
            nroGerado = ThreadLocalRandom.current().nextInt(0,101);
            rodada++;
        
            
        if(nroGerado %2 == 0){
        nrosPares++;
        }else{
        nrosImpares++;
        }
        
        if(nroGerado == nroDigitado){
        nroEncontrado++;
            if(nroEncontrado == 1){
            rodadaEncontrada = i;
        }
        
        }
        }
        System.out.println(String.format("Primeira Rodada encontrada: %d\n"
                                         + "Nros Pares: %d\n"
                                         + "Nros Impares %d\n", rodadaEncontrada,
                                         nrosImpares, nrosPares));
        
        }
       
        
        
    }
    

