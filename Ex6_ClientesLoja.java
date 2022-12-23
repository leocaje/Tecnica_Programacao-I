package ex6_clientesloja;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 2022.10.27
 * LISTA 1
 * Ex 6) Uma loja tem 150 clientes cadastrados e deseja mandar uma correspondência a cada um 
 * deles anunciando um bônus especial. Escreva um algoritmo que leia o nome do cliente e 
 * o valor das suas compras no ano passado e calcule um bônus de 10% se o valor das compras 
 * for menor que 500.000 e de 15 %, caso contrário.
 */
 
public class Ex6_ClientesLoja {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cliente;
        String nome;
        float valor, desc10, desc15;
        DecimalFormat frmt = new DecimalFormat("#.##");
        
        System.out.println("CLIENTES CADASTRADOS");
        
        for(cliente = 150; cliente > 0; cliente--){
            System.out.print("\nNome do cliente: ");
            nome = ler.next();
            System.out.print("Valor gasto no ano anterior: R$");
            valor = ler.nextFloat();  
            if(valor < 500.00){
                desc10 = (valor * 10) / 100;
                System.out.println("Bônus de 10% " + 
                        "\nValor: R$" + frmt.format(desc10));
            }
            if(valor >= 500.00){
                desc15 = (valor * 15) / 100;
                System.out.println("Bônus de 15% " + 
                        "\nValor: R$" + frmt.format(desc15));
            }
        }
    }  
}
