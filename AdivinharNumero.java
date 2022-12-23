package adivinharnumero;

import java.util.Random;
import java.util.Scanner;

/**
 * Aula 06 - Estrutura de Repetição
 * 2022.10.04
 */
 
public class AdivinharNumero {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(20);
        int tent = 0;
        
        System.out.println("JOGO DE ADIVINHAR O NÚMERO");
        System.out.println("Tente adivinhar um número entre 0 e 20");
        System.out.println("");
        
        while (tent != num) {
            System.out.println("Insira um número: ");
            tent = ler.nextInt();
            if (tent == num){
                System.out.println("Você acertou!");
            }
            if (tent < num){
                System.out.println("Valor baixo demais.");
                System.out.println("");
            } else if (tent > num) {
                System.out.println("Valor alto demais.");
                System.out.println("");
            }
        }
    }
}
