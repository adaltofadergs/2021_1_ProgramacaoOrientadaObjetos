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
        super.cadastrar(); 
        String texto = "Nome: " + this.nome + "\n" +
                "Telefone: " + this.getTelefone() + "\n" +
                "CPF: " + this.cpf;
        JOptionPane.showMessageDialog(null, texto );
    
    }
    
    
    
}
