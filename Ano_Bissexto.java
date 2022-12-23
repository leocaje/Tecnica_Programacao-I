package ano_bissexto;

import java.util.Scanner;

/**
 * Escrever se um ano informado pelo usuário é bissexto ou não.
 * Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e não por 100).
 * 2022.09.04
 */

public class Ano_Bissexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ANO BISSEXTO");
        System.out.println();
        System.out.print("Insira um ano: ");
        int ano = entrada.nextInt();
        
        if (ano % 4 == 0){
            System.out.println(ano + " é um ano bissexto.");
        } else if (ano % 400 == 0 && ano % 100 != 0){
            System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
        }
    }   
}
