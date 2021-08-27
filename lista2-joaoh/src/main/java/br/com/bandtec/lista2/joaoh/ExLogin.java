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
public class ExLogin {
    public static void main(String[] args) {
        Scanner lerLogin = new Scanner(System.in);
        System.out.println("Digite seu login: ");
        String loginUser = lerLogin.nextLine();
        
        Scanner lerSenha = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senhaUser = lerSenha.nextLine();
        
        if(loginUser.equals("admin") && senhaUser.equals("#Bandtec")){
            System.out.println("Login realizado com sucesso.");
        }else{
              do {            
              System.out.println("Login e/ou senha inválidos. Tente novamente.");
              System.out.println("Digite seu login: ");
              loginUser = lerLogin.nextLine();
            
              System.out.println("Digite sua senha: ");
              senhaUser = lerSenha.nextLine();
        } while (!loginUser.equals("admin") || !senhaUser.equals("#Bandtec"));
        }
        
      
        }
    }
    

