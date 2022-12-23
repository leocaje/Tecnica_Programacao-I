package numeros_fracionarios;

import java.util.Scanner;

/**
 * Ler 3 números fracionários do teclado e informar se o primeiro é maior do que a soma dos dois últimos.
 * 2022.09.04
 */

public class Numeros_Fracionarios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, soma;
        
        System.out.println("Insira três números fracionários");
        System.out.print("Número 1: ");
        n1 = entrada.nextDouble();
        System.out.print("Número 2: ");
        n2 = entrada.nextDouble();
        System.out.print("Número 3: ");
        n3 = entrada.nextDouble();
      
        soma = n2 + n3;
        
        if(n1 > soma){
            System.out.println("O primeiro número " + n1 + " é maior que a soma de " + n2 + " + " + n3 + " = " + soma);
        }
    }
}
