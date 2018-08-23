
public class Candidato {
    private String nome;
    private int qtdVotos;

 //construtor
    public Candidato(String nome) {
        qtdVotos = 0;
        this.nome = nome;
    }
    
 //incremento
    public void incrementoVT(){
        qtdVotos++;  
    }
    
    //metodos 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdVotos() {
        return qtdVotos;
    }

        
    

   
        
}
