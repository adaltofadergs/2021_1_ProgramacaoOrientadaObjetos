package telas;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 5;
        double y = 6.5;
        double soma = x + y;
        
        System.out.println("A soma é: " + soma );
        JOptionPane.showMessageDialog(null, "A soma é: " + soma );
    }
    
    
}
