
package aula06_colecoes;

/**
 *
 * @author adaltoss
 */
public class Cidade {
    public int id;
    public String nome;

    public Cidade() {
    }

    public Cidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.valueOf(id) + " - " + nome; 
    }
    
}
