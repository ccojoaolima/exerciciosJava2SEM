/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

/**
 *
 * @author Aluno
 */
public class AppEncomenda {
    public static void main(String[] args) {
        Encomenda encomenda1 = new Encomenda();
        encomenda1.altura = 5.2;
        encomenda1.largura = 7.7;
        encomenda1.valorEncomenda = 80.00;
        encomenda1.distancia = 42.22;
        
        encomenda1.enderecoDestinatario = "Destinatario, 42";
        encomenda1.enderecoRemetente = "Remetente, 33";
        
        encomenda1.calcularFrete();
    }
    
}
