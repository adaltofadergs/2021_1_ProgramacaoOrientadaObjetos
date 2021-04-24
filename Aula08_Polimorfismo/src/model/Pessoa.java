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
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public Pessoa(String nome, int id){
        this.id = id;
        this.nome = nome;
    }
    
    public Pessoa(String nome, String end){
        this.endereco = end;
        this.nome = nome;
    }
    
    public Pessoa(String end, String nome, String fone){
        this.endereco = end;
        this.nome = nome;
        this.telefone = fone;
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
    
    public void cadastrar(String nome){
        String texto = "Nome: " + nome + "\n" +
                "Telefone: " + this.telefone;
        JOptionPane.showMessageDialog(null, texto );
    }
    
    public void cadastrar(String nome, String fone){
        String texto = "Nome: " + nome + "\n" +
                "Telefone: " + fone;
        JOptionPane.showMessageDialog(null, texto );
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getInformacoes(){
        return this.nome + " - " + this.endereco;
    }
    
    public final void imprimirNome(){
        JOptionPane.showMessageDialog(null, this.nome );
    }
    
    public static void imprimirBomDIa(){
        JOptionPane.showMessageDialog(null, "Bom dia!" );
        
        
    } 
        
}
