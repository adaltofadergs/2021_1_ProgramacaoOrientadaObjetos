
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Perecivel;

/**
 *
 * @author adaltoss
 */
public class TelaInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String opcao = "s";
        
        List<Perecivel> listaPerecivel = new ArrayList<>();
        
        while( ! opcao.equalsIgnoreCase( "n" )){
            String texto = "Digite sua opção: \n" + 
                    "1 - Adicionar Perecivel \n" + 
                    "2 - Remover Perecivel \n" + 
                    "3 - Listar Perecíveis \n" + 
                    "n - Sair ";
            opcao =  JOptionPane.showInputDialog(texto);
            
            switch( opcao ){
                case "1":
                    Perecivel p = new Perecivel();
                    String nome = JOptionPane.showInputDialog("Nome do Perecível");
                    p.setNome(nome);
                    
                    String preco = JOptionPane.showInputDialog("Preço do Perecível " + nome);
                    preco = preco.replace(",", ".");
                    p.setPreco( Double.valueOf( preco ) );
                    
                    String qtd = JOptionPane.showInputDialog("Quantidade do Perecível" + nome );
                    qtd = qtd.replace(",", ".");
                    p.setQuantidade(Double.valueOf( qtd ) );
                    
                    listaPerecivel.add( p );
                    break;
                case "2":
                    int posicao = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    listaPerecivel.remove(posicao -1 );
                    break;
                case "3":
                    String conteudo = "";
                    for (Perecivel perecivel : listaPerecivel) {
                        conteudo += perecivel.getInformacoes() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, conteudo);
                    break;
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
                    
            }
        }
    }
}
