package mes;

import java.util.Scanner;

/**
 * Crie um programa que solicite ao usuário informar o número referente ao mês e exibir o nome do mês de 
 * acordo com o número informado pelo usuário e caso o número seja < 0 ou > 12, exibir a mensagem de ERRO.
 * 2022.09.04
 */

public class Mes {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o número do mês: ");
        int mes = entrada.nextInt();
        
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("ERRO");
                break;
        }
    }
}
