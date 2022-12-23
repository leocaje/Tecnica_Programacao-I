package ex1_mediavalores;

import java.util.Scanner;

/**
 * 2022.10.26
 * LISTA 1
 * Ex 1) Escreva um algoritmo (e programe-o na linguagem Java) que leia a quantidade de valores que serão 
 * processados e depois leia os valores e calcule a média dos mesmos. Utilize a estrutura de repetição PARA. 
 */

public class Ex1_MediaValores {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont, tot, num;
        float soma = 0;
        
        System.out.println("CALCULAR MÉDIA DE VALORES\n");
        System.out.print("Quantidade de valores a serem inseridos: ");
        tot = ler.nextInt();
        
        for(cont = 1; cont <= tot; cont++){
            System.out.print("\nInsira o valor: ");
            num = ler.nextInt();
            soma = soma + num;
        }
        
        System.out.println("Média: " + (soma / tot));
    }    
}
