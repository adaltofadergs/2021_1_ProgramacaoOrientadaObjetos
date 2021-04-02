package aula05;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Calculo {
    
    public static final double PI = 3.141592653589;
    
    public static double calcularAreaCirculo(double raio){
        double area = PI * ( Math.pow( raio, 2) );
        return area;
    } 
    
}
