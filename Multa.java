package multa;

import java.util.Scanner;

/**
 * Calcular a multa:
 * Leia a velocidade de um carro e a velocidade máxima para a rua:
 * 1. Informe 50 reais se estiver até 10km/h acima;
 * 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima;
 * 3. Informe 300 reais se estiver acima de 31km/h acima;
 * 2022.09.04
 */

public class Multa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Aplicação de Multa");
        System.out.print("Digite a velocidade do veículo: ");
        int vel_auto = entrada.nextInt();
        System.out.print("Digite a velocidade máxima da rua: ");
        int vel_max = entrada.nextInt();
        int calculo = vel_auto - vel_max;
        System.out.println();
        
        if (vel_auto <= vel_max){
            System.out.println("O veículo não ultrapassou o limite máximo de velocidade."
                    + "\nNão há multa a ser aplicada.");
        }
        
        if (calculo > 0 && calculo <= 10){
            System.out.println("Até 10km/h acima da velocidade permitida:");
            System.out.println("O valor da multa é de R$50,00.");
        } else {
            if (calculo > 10 && calculo <= 30){
                System.out.println("Entre 11km/h e 30km/h acima da velocidade permitida:");
                System.out.println("O valor da multa é de R$100,00.");
            } else {
                if (calculo > 30){
                    System.out.println("Superior a 30km/h acima da velocidade permitida:");
                    System.out.println("O valor da multa é de R$200,00.");
                }
            }
        }
    }    
}
