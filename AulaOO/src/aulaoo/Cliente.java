package aulaoo;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Cliente {
    
    public static int MAIORIDADE = 18;
     
    public int id;
    public String nome, endereco, email;
    private int idade;
    protected String cpf;
    public Cidade municipio;
    
    
    public static double calcularEndividamentoMaximo(double valorHora, double horas){
        double salario = valorHora * horas;
        return (salario * 0.3);
    }
    
    
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        if( idade >= MAIORIDADE ){
            this.idade = idade;
        }else{
            JOptionPane.showMessageDialog(null, "A idade não pode ser inferior a 18!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cidade getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Cidade municipio) {
        this.municipio = municipio;
    }
    
    
    
    
    
}
