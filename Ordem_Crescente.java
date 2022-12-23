package ordem_crescente;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ler 3 valores em qualquer ordem e escrevê-los em ordem crescente.
 * 2022.09.04
 */

public class Ordem_Crescente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[3];
        System.out.println("ORDEM CRESCENTE");
        System.out.println();

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite " + (i+1) + "° número: ");
            num[i] = entrada.nextInt();
        }
        System.out.println("");
        
        Arrays.sort(num);
        
        System.out.println("Ordem Crescente é: ");
        for(int j = 0; j < num.length; j++){
            System.out.println(num[j] + " ");
        }
    }   
}
