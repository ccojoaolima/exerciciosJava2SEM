
package br.com.bandtec.projeto.pokemon;


public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces;

   //após a definição dos atributos, fazer um construtor para ajudar na jornada, que já peça as infos. necessárias
   //o construtor será chamado apenas 1 vez
    public Pokemon(String nome, String tipo, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        //nao faz sentido os doces serem iguais aos doces definidos previamente, e começarão em 0
        //portanto, definimos os doces em 0 já no construtor
        //Ao colocar o 0 nas variávies, receber os doces serão OPCIONAIS
        this.doces = 0;
    }
    
   //agora, iniciaremos os getters e setters, iniciaremos começando os getters e setters para tudo, e removemos
   //a medida que realizamos o que não está sendo utilizado.
  
   //Se eu preciso exibir o nome do pokemon em outro lugar, necessitamos de um get com o seu nome, por ex. 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }
    
    //para facilitar a vida, criaremos um toString, a SOBREESCRITA.
    //herdamos o método de alguém e readapto a minha realidade.
   
    //usaremos o THIS pq fica explicito que usaremos um atributo de MINHA classe.
    //ESSE nome = o nome DESTA classe! Assim, não houverá conflito de nomenclatura.
    @Override
    public String toString() {
        return String.format("Nome: %s, tipo: %s, força: %.1f, doces :%d", 
                this.nome, this.tipo, this.forca, this.doces);
    }
    
    
    
  }