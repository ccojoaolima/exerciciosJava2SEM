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
public class ExTabuada {
    public static void main(String[] args) {
        Scanner lerNro = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer numero = lerNro.nextInt();
        
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", numero, i, (numero * i)));
            
        }
    }
}
