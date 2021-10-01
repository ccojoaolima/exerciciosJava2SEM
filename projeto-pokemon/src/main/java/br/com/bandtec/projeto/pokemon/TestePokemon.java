
package br.com.bandtec.projeto.pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        
        Pokemon pokemon1 = new Pokemon("Bulbassauro", "Grama", 20.0);
        Pokemon pokemon2 = new Pokemon("Charmander", "fogo", 10.0);
        Pokemon pokemon3 = new Pokemon("Chikorita", "Grama", 10.0);
        
        TreinadorPokemon t1 = new TreinadorPokemon("Leibinha");
        t1.treinarPokemon(pokemon3);
        t1.treinarPokemon(pokemon3);
        t1.treinarPokemon(pokemon3);
        t1.treinarPokemon(pokemon3);
        t1.treinarPokemon(pokemon3);

        t1.evoluirPokemon(pokemon3, "Bayleef");
        t1.treinarPokemon(pokemon3);
            
        

        
        
    }
} 
