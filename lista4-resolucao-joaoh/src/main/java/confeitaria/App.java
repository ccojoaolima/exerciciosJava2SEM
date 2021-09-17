/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria;

/**
 *
 * @author Aluno
 */
public class App {
    public static void main(String[] args) {
        Bolo bolo1 = new Bolo();
        bolo1.saborBolo = "Abacaxi";
        bolo1.valorBolo = 30.00;
        bolo1.comprarBolo();
        
        Bolo bolo2 = new Bolo();
        bolo2.saborBolo = "Morango";
        bolo2.valorBolo = 45.00;
        bolo2.comprarBolo();
        
        Bolo bolo3 = new Bolo();
        bolo3.saborBolo = "Chocolate";
        bolo3.valorBolo = 50.00;
        bolo3.comprarBolo();
        
        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();
        
    }
    
}
