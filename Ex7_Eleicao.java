package ex7_eleicao;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 2022.10.28
 * LISTA 1
 * Ex 7) Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos.
 * Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:  
        - 1,2,3,4 = voto para os respectivos candidatos;
        - 5 = voto nulo;
        - 6 = voto em branco;
 * Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva:
        - total de votos para cada candidato;
        - total de votos nulos;
        - total de votos em branco;
 * Como finalizador do conjunto de votos, tem-se o valor 0.
 */
 
public class Ex7_Eleicao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cod, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, nulo = 0, brnc = 0, votos = 0;
        
        JOptionPane.showMessageDialog(null, "ELEIÇÃO PRESIDENCIAL"
                + "\n" + "\nContagem de Votos");
        
        do{
            cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código do candidato: "
                    + "\n1 - Candidato A"
                    + "\n2 - Candidato B"
                    + "\n3 - Candidato C"
                    + "\n4 - Candidato D"
                    + "\n5 - Voto nulo"
                    + "\n6 - Voto branco"
                    + "\n0 - Encerrar sistema"));
            
            switch(cod){
                case 1:
                    cand1++;
                    votos++;
                    break;
                case 2:
                    cand2++;
                    votos++;
                    break;
                case 3:
                    cand3++;
                    votos++;
                    break;
                case 4:
                    cand4++;
                    votos++;
                    break;
                case 5:
                    nulo++;
                    votos++;
                    break;
                case 6:
                    brnc++;
                    votos++;
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número inválido!");
            }                        
        }while(cod != 0);
        
        JOptionPane.showMessageDialog(null, "TOTAL DE VOTOS: " + votos + "\n"
                + "\nCandidato A: " + cand1
                + "\nCandidato B: " + cand2
                + "\nCandidato C: " + cand3
                + "\nCandidato D: " + cand4
                + "\nNulos: " + nulo
                + "\nBrancos: " + brnc);
    }  
}
