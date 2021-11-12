/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoheranca;

/**
 *
 * @author aluno
 */
class Tree{}
class Pine extends Tree{}
class Oak extends Tree{}
public class p32{
public static void main( String[] args ) 
   {  Tree tree = new Pine();

      if( tree instanceof Pine )
      System.out.println( "Pine" );

      if( tree instanceof Tree )
      System.out.println( "Tree" );

      if( tree instanceof Oak )
      System.out.println( "Oak" );

      else System.out.println( "Oops" );
   }
}
