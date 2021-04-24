package view;

import model.Animal;
import model.Bovino;

/**
 *
 * @author adaltoss
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bovino b = new Bovino();
                
        b.nome = "Mimoso";
        
        System.out.println( b.toString() );
        
        
    }
    
}
