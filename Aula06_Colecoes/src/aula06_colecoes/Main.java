package aula06_colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author adaltoss
 */
public class Main {

    public static void main(String[] args) {
        int[] inteiros;
        double reais[] = new double[5];
        
        inteiros = new int[100];
        for(int i = 0 ; i < inteiros.length ; i++){
            inteiros[i] = i * 2;
        }
        
        reais[0] = 2.5; 
        reais[1] = 5.0; 
        reais[2] = 7.5; 
        
        for( double x : reais){
            System.out.println("Valor real: " + x);
        }

        System.out.println("Inteiros: " + inteiros[ 30 ]);
        
        String[] nomes = { "Adalto", "Júlia", "João", "Maria" };
        String[] carros = new String[3];
        carros[0] = "Doblo";
        carros[1] = "Toro";
        carros[2] = "Uno";
        
        nomes[2] = "José";
        
        for (int i = 0; i < 4; i++) {
            System.out.println( nomes[i] );
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println( carros[i] );
        }
        
        Collection<String> frutas = new ArrayList<String>();
        frutas.add( "Banana" );
        frutas.add( "Abacaxi" );
        frutas.add( "Laranja" );
        System.out.println( frutas );
        
        frutas.add( "Abacaxi" );
        System.out.println( frutas );
        
        Set<String> avioes = new HashSet<String>();
        avioes.add("737-200");
        avioes.add("737-Max");
        avioes.add("737-200");
        
        System.out.println(avioes);
        
        System.out.println("Quantidade de frutas: " + frutas.size());
        if( frutas.contains( "Banana-") ){
            System.out.println("Encontrou");
        }else{
            System.out.println("Não encontou");
        }
        
        List<Cidade> cidades = new ArrayList<Cidade>();
        
        Cidade c1 = new Cidade( 1, "POA");
        Cidade c2 = new Cidade( 2, "Canoas");
        
        cidades.add( c1 );
        cidades.add( c2 );
        cidades.add( c1 );
        System.out.println("----------------");
        
        System.out.println(cidades);
        
        System.out.println("Cid [1]: " + cidades.get(1) );
        
        // cidades.remove(2);
        cidades.remove(c1);
        
        System.out.println(cidades);
        
    }
    
}
