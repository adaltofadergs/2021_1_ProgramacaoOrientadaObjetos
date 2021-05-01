package model;

import java.util.List;

/**
 *
 * @author adaltoss
 */
public abstract class Produto {
    
    public static final int DUZIA = 12;
    public static final double PRECO_MINIMO = 1.99;
    
    public String nome;
    protected double preco;
    private double quantidade;
    
    // Estes dois atributos foram criados no final da aula para responder a uma pergunta de um aluno
    public Prateleira prateleira;
    public List<Prateleira> preteleiras;
    
    
    public Produto(){
        
    }
    
    public Produto(String nome){
        this.nome = nome;
    }
    public Produto(double preco){
        this.preco = preco;
    }
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(double quantidade, String nome){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    
    
    
    public abstract void excluir();
    
    protected abstract void zerarEstoque();
    
    public abstract void imprimir();
    
    public String getInformacoes(){
        return "{ 'nome': '" + nome + "' , 'preco': " +preco + " , 'quantidade': " + quantidade + " }";
    }
    
    public static final double getCotacaoDollar(){
        return 5.34;
    }
    
    public static double getCotacaoDollarOntem(){
        return 5.34;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if( quantidade >= 0 ) 
            this.quantidade = quantidade;
        else 
            System.out.println("Quantidade não poder ser menor que Zero!");
    }
    
    
    
    
    
    
}
