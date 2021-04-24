package model;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Fisica extends Pessoa {
    
    public String cpf;
    
    public Fisica(){
        super();
    }
    
    public Fisica(int id, String name, String end, String fone, String cpf){
        super(id, name, end, fone);
        this.cpf = cpf;
    }

    @Override
    public void cadastrar() {
//      super.cadastrar(); 
        String texto = "Nome: " + this.nome + "\n" +
                "Telefone: " + this.getTelefone() + "\n" +
                "CPF: " + this.cpf;
        JOptionPane.showMessageDialog(null, texto );
    }
    
    @Override
    public void cadastrar(String nome) {
//      super.cadastrar(); 
        String texto = "Nome: " + nome + "\n" +
                "Telefone: " + this.getTelefone() + "\n" +
                "CPF: " + this.cpf;
        JOptionPane.showMessageDialog(null, texto );
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + " - " + this.cpf; 
    }

//  Método final na superclasse não pode ser sobrescrito
//    @Override
//    public void imprimirNome() {
//        super.imprimirNome(); 
//    }

    
//  Método estático na superclasse não pode ser sobrescrito
//    @Override
//    public void imprimirBomDIa() {
//        super.imprimirBomDIa(); //To change body of generated methods, choose Tools | Templates.
//    }

//    public static void imprimirBomDIa(){
//        JOptionPane.showMessageDialog(null, "Bom dia__!" );
//    }
    
    
}
