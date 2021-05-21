
package model;

/**
 *
 * @author adaltoss
 */
public abstract class Pessoa {
    
    public int id;
    public String nome, fone;
    public Cidade cidade;
    
    public abstract void cadastrar();
    
}
