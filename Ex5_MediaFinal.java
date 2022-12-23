package ex5_mediafinal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 2022.10.25
 * LISTA 1
 * Ex 5) Faça um programa que leia as médias finais de vários alunos de uma turma e mostre a maior média, 
 * a menor média e a média aritmética da turma. O programa para quando encontrar uma média negativa.
 */
 
public class Ex5_MediaFinal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float media = 0, maior = -1, menor = 11, soma = 0;
        int cont = 0, i;
        
        JOptionPane.showMessageDialog(null, "RELAÇÃO DE MÉDIAS DA TURMA");
        cont = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos na turma: "));
        i = cont;
        
        while(cont > 0){
            media = Float.parseFloat(JOptionPane.showInputDialog("Média do aluno: "
                    + "\n(Insira nota negativa para encerrar o programa)"));
            soma = soma + media;
            if(media < menor)
                menor = media;
            if(media > maior)
                maior = media;
            if(media < 0)
                System.exit(0);
            cont--;
        }
        
        JOptionPane.showMessageDialog(null, "A média aritmética da turma é " + (soma / i));
        JOptionPane.showMessageDialog(null, "A menor média da turma é " + menor);
        JOptionPane.showMessageDialog(null, "A maior média da turma é " + maior);
    }
}
