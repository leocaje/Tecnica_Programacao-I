package ex3_valoresreais;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 2022.10.26
 * LISTA 1
 * Ex 3) Escreva um algoritmo (e programe-o na linguagem Java) que leia um grupo de valores reais e determine 
 * quantos valores são positivos e quantos são negativos. Determine também qual é o menor desses valores. 
 * Utilize o comando de repetição que deseje. 
 */
 
public class Ex3_ValoresReais {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num, soma = 0;
        int cont, i = 1, j, pos = 0, neg = 0;
        DecimalFormat frmt = new DecimalFormat("#.###");
        
        JOptionPane.showMessageDialog(null, "CALCULAR MÉDIA DE VALORES");
        cont = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserir quantos valores?"));
        j = cont;
        
        do{
            num = Float.parseFloat(JOptionPane.showInputDialog(null, i + "º valor: "));
            soma += num;
            if(num > 0)
                pos = pos + 1;
            if(num < 0)
                neg = neg + 1;
            cont--;
            i = i + 1;
        } while(cont > 0);
        
        JOptionPane.showMessageDialog(null, "Média: " + (soma / j), "Resultado", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, pos + " valores positivos\n" 
                + neg + " valores negativos", "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
