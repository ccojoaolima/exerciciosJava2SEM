/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.maven1;

import com.github.javafaker.Faker;
import java.util.Locale;

/**
 *
 * @author Aluno
 */
public class TesteFaker {
    public static void main(String[] args) {
        Faker faker1 = new Faker(new Locale("pt","BR"));
        System.out.println(faker1.name().fullName());
        
        System.out.println(faker1.food().sushi());
        System.out.println(faker1.leagueOfLegends().champion());
        System.out.println(faker1.phoneNumber().cellPhone());
    }
}
