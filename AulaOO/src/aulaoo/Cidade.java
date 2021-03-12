package aulaoo;

/**
 *
 * @author adaltoss
 */
public class Cidade {
    
    public int id;
    public String nome;
    
    public Cidade(){
        
    }
    
    public Cidade(String nome){
        this.nome = nome;
    }
    
    public Cidade(int id){
        this.id = id;
    }
    
    public Cidade(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public Cidade(String nome, int id){
        this.id = id;
        this.nome = nome;
    }
    
    public void imprimirCidade(){
        System.out.println( "Id: " + this.id +
                            "\nNome: " + this.nome);
    }
    
    
    public String retornarCidade(){
        String texto =  "Id: " + this.id +
                            "\nNome: " + this.nome;
        
        return texto;
    }
    
    
    
    
}
