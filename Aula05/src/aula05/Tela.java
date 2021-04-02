
package aula05;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Tela {

    public static void main(String[] args) {
        System.out.println( "Valor do PI: " + Calculo.PI );
        System.out.println( "Área do círculo com raio 2: " + Calculo.calcularAreaCirculo(2) );
        Circulo c1 = new Circulo();
        c1.raio = 2 ;
        System.out.println( "Área do círculo C1: " + c1.getArea() );
        
        double raio = Double.valueOf( JOptionPane.showInputDialog("Digite o raio:")  );
        
        System.out.println( "Área do círculo static: " + Circulo.calcularArea( raio ) );
        
        int resposta = JOptionPane.showConfirmDialog(
                null, 
                "Seu time ganhou o jogo ontem?", 
                "Pergunta...", 
                JOptionPane.YES_NO_OPTION);
        if( resposta == JOptionPane.YES_OPTION){
            System.out.println("Parabéns!!!");
            
        }
        if( resposta == JOptionPane.NO_OPTION){
            System.out.println("Que pena!!!");
            
        }
    }
}
