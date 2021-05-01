
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Perecivel extends Produto{
    
    public double temperaturaRecomentada;
    public static final double TEMPERATURA_MINIMA = -18.5;

    public Perecivel() {
        
    }

    public Perecivel(String nome) {
        super(nome);
    }

    public Perecivel(double temperaturaRecomentada, String nome) {
        super(nome);
        this.temperaturaRecomentada = temperaturaRecomentada;
    }

    public Perecivel(double temperaturaRecomentada, String nome, double preco, double quantidade) {
        super(nome, preco, quantidade);
        this.temperaturaRecomentada = temperaturaRecomentada;
    }
    
    
    
    
    
    

    @Override
    public void excluir() {
        this.zerarEstoque();
        System.out.println("Produto perecível "+ nome + " excluído");
    }

    @Override
    protected void zerarEstoque() {
        this.setQuantidade( 0.0 );
    }

    @Override
    public void imprimir() {
        String texto = "Nome: "+ nome + "\nPreço: " + preco + "\nQuantidade: " + this.getQuantidade() 
                + "\nTemperatura Recomendada: " + temperaturaRecomentada ;
        JOptionPane.showMessageDialog(null, texto);
        
    }

    @Override
    public String getInformacoes() {
        return "{   'nome': '" + nome + "'  ,  "
                + " 'preco': " + preco + "  ,  "
                + " 'quantidade': " + this.getQuantidade() + " , " 
                + " 'temperaturaRecomendada': " + temperaturaRecomentada + " } ";
    }

   
    
    
    
    
}
