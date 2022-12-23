package pesquisadadospessoa;

import java.util.Scanner;

/**
 * 2022.11.08
 * 1-) Desenvolver um programa para fazer uma pesquisa com um número N de pessoas (Determinado pelo usuário), 
 * nesta pesquisa será solicitado o nome, a sua idade e altura. 
 * Após coletar os dados, informar os seguintes dados: 
    - Média das alturas; 
    - Número de pessoas que tem a altura acima da média; 
    - Número de pessoas que tem a altura abaixo da média; 
    - Percentual de pessoas com menos de 18 anos; 
 */
 
public class PesquisaDadosPessoa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtde, i, id = 0, alt_abaixo = 0, alt_acima = 0;
        double media_alt = 0, alt = 0, id_perc = 0;
                
        System.out.println("PESQUISA SOBRE A POPULAÇÃO");
        System.out.println("\nQuantas pessoas foram entrevistadas? ");
        qtde = ler.nextInt();
        
        if(qtde > 0){
            String nome[] = new String[qtde];
            int idade[] = new int[qtde];
            double altura[] = new double[qtde];
            
            for(i = 0; i < qtde; i++){
                System.out.print("\nNome: ");
                nome[i] = ler.next();
                
                System.out.print("Idade: ");
                idade[i] = ler.nextInt();
                                
                System.out.print("Altura: ");
                altura[i] = ler.nextDouble();
                alt = alt + altura[i];                
            }
              
            media_alt = alt / qtde;            
            for(i = 0; i < qtde; i++){
                if(idade[i] < 18){
                    id = id + 1;
                } 
                if(altura[i] < media_alt){
                    alt_abaixo = alt_abaixo + 1;
                } else if(altura[i] > media_alt){
                    alt_acima = alt_acima + 1;
                }
            }
            id_perc = (id * 100) / qtde;

        } else {
            System.out.println("Erro. Quantidade inválida de entrevistados.");
        }
        
        System.out.println("\nA média das alturas é de: " + media_alt + "m");
        System.out.println(alt_acima + " pessoas têm altura acima da média");
        System.out.println(alt_abaixo + " pessoas têm altura abaixo da média");
        System.out.println("O percentual de pessoas menores de 18 anos é de " + id_perc + "%");        
    }    
}
