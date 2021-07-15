/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class ArrayVetor {

    public static void main(String[] args) {

        String[] valores = {"Wesley", "50", "Java Developer", "wesleysaraiva109@gmail.com"};
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor:" + (i + 1) + " = " + valores[i]);

        }

        String posicoes = JOptionPane.showInputDialog("Quantas posicoes o Array deve ter");
        //Array pode ser de todos de dados e objetos tambem
        //Array sempre deve ter  a quantidade de posições definidas
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int i = 0; i < notas.length; i++) {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor "
                    + "da posicao:" + (i + 1)));
            notas[i] = valor;
        }

        System.out.println("Notas disponibilizadas");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " = " + notas[i]);
        }

        String[] valores2 = {"Jose", "56", "Java Developer", "Axlrose"};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Resultado do valores 2: " + valores2[i]);
        }
        int posicoes2 = Integer.parseInt(JOptionPane.showInputDialog("Quantos arrays"
                + "voce deseja?"));

        double[] notas2 = new double[posicoes2];

        for (int i = 0; i < notas2.length; i++) {
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Qual "
                    + "valor da posicao" + (posicoes2 + 1)));
            notas2[i] = valor2;
        }
        for (int i=0; i< notas2.length;i++ ) {
            System.out.println("Nota "+(posicoes2+1)+" = "+notas2[i]);
        }
    }
}
