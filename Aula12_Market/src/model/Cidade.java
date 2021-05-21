
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adaltoss
 */
public class Cidade {
    public int id;
    public String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome ;
    }
    
    
    
    public static List<Cidade> getCidades(){
        Cidade c0 = new Cidade(0, "Selecione...");
        Cidade c1 = new Cidade(1, "Alvorada");
        Cidade c2 = new Cidade(2, "Canoas");
        Cidade c3 = new Cidade(3, "Porto Alegre");
        
        List<Cidade> lista = new ArrayList<>();
        lista.add( c0 );
        lista.add( c1 );
        lista.add( c2 );
        lista.add( c3 );
        
        return lista;
    }
    
    
}
