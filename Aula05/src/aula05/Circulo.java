
package aula05;

/**
 *
 * @author adaltoss
 */
public class Circulo {
    
    public double raio;
    private double diametro;
    
    public static double calcularArea(double _raio){
        return Calculo.calcularAreaCirculo( _raio );
    }
    
    public double getArea(){
        return Calculo.calcularAreaCirculo( this.raio );
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return raio * 2;
    }

    public void setDiametro() {
        this.diametro = raio * 2;
    }
    
    
    
    
}
