package ex8_pesquisapopulacao;

import java.util.Scanner;

/**
 * 2022.10.23
 * LISTA 1
 * Ex 8) Foi realizada uma pesquisa de algumas características físicas da população de um certa região. 
 * Foram entrevistadas 500 pessoas e coletados os seguintes dados:  
        a- sexo: M (masculino) e F (feminino)
        b- cor dos olhos: A (azuis), V (verdes) e C (castanhos)
        c- cor dos cabelos: L (louros), C (castanhos) e P (pretos)
        d- idade
* Deseja-se saber:
        - a maior idade do grupo
        - a quantidade de indivíduos do sexo feminino, cuja idade está entre 18 e 35 anos 
          e que tenham olhos verdes e cabelos louros.
 */
 
public class Ex8_PesquisaPopulacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pessoa = 1, idade, maior_id = 0, cont = 0;
        String sexo, olho, cab;
        
        System.out.println("PESQUISA - Características Físicas da População");
        
        while(pessoa <= 500){
            System.out.print("\nSexo [F | M]: ");
            sexo = ler.next();
            System.out.print("Idade: ");
            idade = ler.nextInt();
            System.out.print("Cor dos olhos [A - azul | V - verde | C - castanho]: ");
            olho = ler.next();
            System.out.print("Cor dos cabelos [L - loiro | C - castanho | P - preto]: ");
            cab = ler.next();
            if(idade > maior_id)
                maior_id = idade;
            if(sexo.equalsIgnoreCase("f")){
                if(idade >= 18 && idade <= 35){
                    if(olho.equalsIgnoreCase("v")){
                        if(cab.equalsIgnoreCase("l")){
                            cont++;
                        }
                    }
                }
            }
            pessoa++;
        }
        
        System.out.println("\nA maior idade do grupo é de " + maior_id + " anos");
        System.out.println("\nHá " + cont + " mulheres entre 18 e 35 anos"
                + "\nque possuem olhos verdes e cabelos loiros");
    }    
}
