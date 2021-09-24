/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.exercicio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AppConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Joao",0.0);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a opção desejada. 1 - Deposito 2 - Saque 3 - Verif. Conta");
        Integer opcaoDesejada = in.nextInt();
        
        do{     
        switch(opcaoDesejada){
            case 1:
            conta1.depositar();
            conta1.verificarConta();
            break;
            case 2:
            conta1.sacar();
            conta1.verificarConta();
            break;
            case 3:
            conta1.verificarDetalhesDaConta();
            break;
            case 4:
            break;
            default: System.out.println("Opcao invalida");
        }
        }while(opcaoDesejada != 4);
        
    }
}
