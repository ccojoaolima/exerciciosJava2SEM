package br.com.bandtec.lista2.joaoh;

import java.util.Scanner;

public class ExAcumulador {
    public static void main(String[] args) {
        
        Integer total = 0;
        Scanner lerNro = new Scanner(System.in);
        System.out.println("Digite um numero");
        Integer nroDigitado = lerNro.nextInt();
        
        
        while(nroDigitado > 0){
                       
            if(nroDigitado == 0){
                System.out.println("Soma dos numeros:" + total);
            }else{
            total = total + nroDigitado;
            }
        
        }
                
        
        
        
    }
    
}
