
package view;

import model.Fisica;
import model.Pessoa;

/**
 *
 * @author adaltoss
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(0, null, null, null);
        p1.nome = "João";
        
        Fisica pf = new Fisica(1, "João", "Rua a", "123", "00");
        pf.cadastrar();
        
        //Pessoa p2 = new Fisica();
        
        
       
    }
    
}
