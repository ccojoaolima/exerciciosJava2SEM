/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista2.joaoh;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExPotencia {
    public static void main(String[] args) {
        Scanner lerNro = new Scanner(System.in);
        System.out.println("Digite a base: ");
        Integer base = lerNro.nextInt();
        Integer total = base;
        System.out.println("Digite o expoente");
        Integer expoente = lerNro.nextInt();
        
        Integer contador = 0;
        Integer nroInicial = 1;
        
        while (contador< expoente) {
        nroInicial = nroInicial * base;
        contador++;
        }
        
        System.out.println(String.format("Resultado da potenciação: %d", nroInicial));
    }
    
}
