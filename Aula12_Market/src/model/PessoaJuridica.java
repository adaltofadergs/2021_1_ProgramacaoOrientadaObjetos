package model;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class PessoaJuridica extends Pessoa{

    public String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
    
    
    @Override
    public void cadastrar() {
        JOptionPane.showMessageDialog(null, "A pessoa Jurídica "+nome+" foi cadastrada!");
    }
    
    
    
}
