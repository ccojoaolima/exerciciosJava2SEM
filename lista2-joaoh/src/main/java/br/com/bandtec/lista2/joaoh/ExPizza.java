package br.com.bandtec.lista2.joaoh;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExPizza {
    public static void main(String[] args) {
        Integer contadorVotosMussarela = 0;
        Integer contadorVotosCalabresa = 0;
        Integer contadorVotosQQ = 0;
        
        Scanner lerVotos = new Scanner(System.in);
        System.out.println("Vote no seu sabor favorito de pizza! \n"
                           + "Mussarela - Vote 5 \n"
                           + "Calabresa - Vote 25 \n"
                           + "4 Queijos - Vote 50");
        Integer votoPizza = lerVotos.nextInt();
        
        for (int i = 0; i <= 10; i++) {
        System.out.println("Vote no seu sabor favorito de pizza! \n"
                           + "Mussarela - Vote 5 \n"
                           + "Calabresa - Vote 25 \n"
                           + "4 Queijos - Vote 50");
        votoPizza = lerVotos.nextInt();
       
        if(votoPizza == 5){
        contadorVotosMussarela++;
        }else if(votoPizza == 25){
        contadorVotosCalabresa++;
        }else{
        contadorVotosQQ++;
        }
        
        
    }
        System.out.println("Votação de cada sabor! \n"
                           + "Mussarela: " + contadorVotosMussarela + " Votos\n"
                           + "Calabresa: " + contadorVotosCalabresa + " Votos\n"
                           + "4 Queijos: " + contadorVotosQQ + " Votos\n"); 
        
        if(contadorVotosCalabresa > contadorVotosMussarela && contadorVotosCalabresa > contadorVotosQQ ){
            System.out.println("Calabresa é a vencedora!");
        }else if(contadorVotosMussarela > contadorVotosCalabresa && contadorVotosMussarela > contadorVotosQQ){
            System.out.println("Mussarela é a vencedora!");
        }else{
            System.out.println("Quatro Queijos é a vencedora!");
        }
        
    
    }}
