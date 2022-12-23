package ex4_infopessoa;

import java.util.Scanner;

/**
 * 2022.10.23
 * LISTA 1
 * Ex 4) Temos um grupo de pessoas. Escreva um algoritmo (e programe-o na linguagem Java) que leia 
 * o sexo e a estatura de cada pessoa e determine e visualize a estatura média das mulheres. 
 * O algoritmo deverá, também, contar os homens nesse grupo. Utilize o comando de repetição que deseje.
 */
 
public class Ex4_InfoPessoa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String sexo, resp;
        float altura, somaA = 0;
        int cont = 1, contF = 0, contM = 0;
        
        System.out.println("INFORMAÇÃO DE PESSOAS");
        
        do{
            System.out.println("\nPessoa " + cont);
            System.out.print("Sexo [F | M]: ");
            sexo = ler.next();
            if (sexo.equalsIgnoreCase("F")){
                contF = contF + 1;
            } else if (sexo.equalsIgnoreCase("M")){
                contM = contM + 1;
            }
            System.out.print("Altura: ");
            altura = ler.nextFloat();
            if (altura > 0 && sexo.equalsIgnoreCase("F")){
                somaA = somaA + altura;
            }
            System.out.print("\nDeseja acrescentar mais uma pessoa? [S | N]: ");
            resp = ler.next();    
            cont++;
        } while(resp.equalsIgnoreCase("S"));
        
        System.out.println("\nA altura média das mulheres é de " + (somaA / contF));
        System.out.println("Há " + contM + " homens no grupo");
    }    
}
