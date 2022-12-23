package ex9_tempsemana;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * 2022.10.25
 * TAREFA 2
 * Desenvolva um programa na linguagem java, que receba a média da temperatura diária durante um período 
 * de 7 dias (armazene as informações em um vetor), calcule a média da temperatura desse período (semanal) 
 * e informe quantos dias a temperatura ficou acima da média e quantos ficou abaixo da média semanal.
 */
 
public class Ex9_TempSemana {

    public static void main(String[] args) {
        float tempSemana[] = new float[7];
        float temp = 0, mediatemp;
        int index, abmedia = 0, acmedia = 0;
        DecimalFormat frmt = new DecimalFormat("#.##"); //classe para imprimir apenas duas casas decimais
        
        JOptionPane.showMessageDialog(null, "TEMPERATURA SEMANAL");
        
        for(index = 0; index < 7; index++){
            tempSemana[index] = Float.parseFloat(JOptionPane.showInputDialog("Temperatura do " + (index + 1) + "º dia: "));
            temp = temp + tempSemana[index];
        }
        
        mediatemp = temp / index;        
        
        //JOptionPane.showMessageDialog(null, Arrays.toString(tempSemana));        
        for(index = 0; index < 7; index++){
            if(tempSemana[index] < mediatemp)
                abmedia = abmedia + 1;
            if(tempSemana[index] > mediatemp)
                acmedia++;
            System.out.println("Temperatura do " + (index + 1) + "º dia: " + tempSemana[index]);
        }
        System.out.println("\nA média da temperatura na semana foi de " + frmt.format(mediatemp) + "º graus");
        System.out.println(abmedia + " dias ficaram abaixo da média semanal");
        System.out.println(acmedia + " dias ficaram acima da média semanal");
    }   
}
