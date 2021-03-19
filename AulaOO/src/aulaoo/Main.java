
package aulaoo;

/**
 *
 * @author adaltoss
 */
public class Main {
    
    
    public static void main(String[] args) {
        
//        int x = 0;
//        
//        Cidade cid2 = new Cidade("Alvorada");
//    //    System.out.println("Nome do cid2: " + cid2.nome);
//        
//        Cidade cid3 = new Cidade(10);
//        Cidade cid4 = new Cidade("Capão da Canoa");
//        Cidade cid5 = new Cidade(12, "Cacequi");
//        Cidade cid6 = new Cidade("Camaquâ", 15);
//        
//        cid5.imprimirCidade();
//        
//        System.out.println("--------------");
//        
//        cid5.nome = "Rosário do Sul";
//        System.out.println("Cidade: \n" + cid5.retornarCidade() );
//        
//        System.out.println("--------------");
//        System.out.println("Cidade: \n" + cid6.retornarCidade() );
//        
//        Cidade cid = new Cidade();
//        cid.id = 25;
//        cid.nome = "Porto Alegre";
//        
//        Cliente cli = new Cliente();
//        cli.id = 1;
//        cli.nome = "João";
//        cli.endereco = "Av. Ipiranga, 1200";
//        cli.municipio = cid;
        
            System.out.println("Valor máximo da parcela: " +  
                    Cliente.calcularEndividamentoMaximo(10, 180) );
        
          Cliente cli2 = new Cliente();
          cli2.nome = "João";
          cli2.setEmail( "joão@gmail.com" );
          cli2.setIdade(20);
          
        
//        System.out.println("Nome: " + cli.nome 
//                + "\nEnd: "  + cli.endereco + 
//                "\nCidade: " + cli.municipio.nome);
    }
    
}

//                  INTERVALO, retornaremos 21:00hs