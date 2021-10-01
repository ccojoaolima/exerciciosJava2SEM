package br.com.bandtec.projeto.pokemon;

public class TreinadorPokemon {
    private String nome;
    private Integer nivel;
    
    //Preciso de um nome em todos os pokemons, entretanto, todo pokemon começa do nível 0
    //Portanto, criaremos um construtor apenas com o nome, que será obrigatório.
    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }
    
    //atributos são privados, métodos sao publicos.
    //o enunciado nao diz que ele retorna algo, logo, void
    public void treinarPokemon(Pokemon pokemonRecebido){
       Double forcaAtual  = pokemonRecebido.getForca();
       Integer qtdDocesAtual = pokemonRecebido.getDoces();
        
       pokemonRecebido.setForca(forcaAtual * 1.1);
       pokemonRecebido.setDoces(qtdDocesAtual + 10);
       
       //o nivel é referente ao proprio objeto, ou seja, aqui o java já entende que este nivel pertence ao nivel declarado
       //acima
       this.nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemonRecebido, String evolucao){
      if(pokemonRecebido.getDoces() >= 50){
          String nomePreEvolucao = pokemonRecebido.getNome();
          Integer qtdDocesAtual = pokemonRecebido.getDoces();
          
          pokemonRecebido.setNome(evolucao);
          pokemonRecebido.setDoces(qtdDocesAtual - 50);
          this.nivel += 10;
          
          System.out.println(String.format("Pokemon %s evoluiu para pokemon %s", nomePreEvolucao, 
                  pokemonRecebido.getNome()));
      }else{
          System.out.println("Operação Inválida.");
      }

    }
 
    
}
