package model;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Pessoa {
    
    public int id;
    public String nome;
    protected String endereco;
    private String telefone;
    
    public Pessoa(){
    
    }
    
    public Pessoa(int id, String nome, String end, String fone){
        this.id = id;
        this.nome = nome;
        this.endereco = end;
        this.telefone = fone;
    }
    
    public void cadastrar(){
        String texto = "Nome: " + this.nome + "\n" +
                "Telefone: " + this.telefone;
        JOptionPane.showMessageDialog(null, texto );
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
      
}
