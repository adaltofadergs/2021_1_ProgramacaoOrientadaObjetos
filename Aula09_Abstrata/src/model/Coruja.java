package model;

/**
 *
 * @author adaltoss
 */
public class Coruja extends Ave{

    @Override
    public void voar() {
        System.out.println(nome + " voou!");
    }

    @Override
    public void cadastrar() {
        System.out.println(nome + ", com penagem "
                + tipoPenagem + " foi cadastrado!");

    }

    @Override
    public String toString() {
        return nome + " - " + tipoPenagem; 
    }
    
    
    
}
