package ex2_maiorvalor;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 2022.10.26
 * LISTA 1
 * Ex 2) Escreva um algoritmo (e programe-o na linguagem Java) que leia um grupo de valores (não sabemos quantos são) 
 * para calcular e visualizar a média desses valores e, também, determinar e visualizar o maior deles. 
 * Utilize uma estrutura de repetição ENQUANTO ou REPITA. 
 */
 
public class Ex2_MaiorValor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, cont = 0, maiornum = 0;
        float soma = 0;
        String resp = "S";
        DecimalFormat frmt = new DecimalFormat("#.##");
        
        JOptionPane.showMessageDialog(null, "CALCULAR MÉDIA DE VALORES");
        
        while(resp.equalsIgnoreCase("S")){
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
            soma += num;
            if(num > maiornum)
                maiornum = num;
            resp = JOptionPane.showInputDialog(null, "Quer inserir mais valores? [S | N]: ");
            cont++;
        }
        
        JOptionPane.showMessageDialog(null, "A média dos valores é " + frmt.format(soma / cont));
        JOptionPane.showMessageDialog(null, "O maior valor inserido é " + maiornum);
    }   
}
