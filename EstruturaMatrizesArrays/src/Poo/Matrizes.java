/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

/**
 *
 * @author wesle
 */
public class Matrizes {

    public static void main(String[] args) {

        int notas[][] = new int[2][3];

        notas[0][0] = 50;
        notas[0][1] = 52;
        notas[0][2] = 41;

        notas[1][0] = 65;
        notas[1][1] = 63;
        notas[1][2] = 80;

        System.out.println(notas[0][1] + "\n" + notas[1][0]);
        //Percorre as linhas
        for (int poslinha = 0; poslinha < notas.length; poslinha++) {
            System.out.println("===================================");
            // Para cada linha percorrer as colunas Array
            for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
                System.out.println("Valores da matriz " + (poscoluna + 1) + " = "
                        + notas[poslinha][poscoluna]);
            }
        }
        int notas2[][] = new int[1][3];

        notas2[0][0] = 52;
        notas2[0][1] = 25;
        notas2[0][2] = 10;

        for (int poslinha = 0; poslinha < notas2.length; poslinha++) {
            System.out.println("=============================");
            for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
                System.out.println("Valores da matrizes Pt2: " + (poscoluna + 1) + " = "
                        + notas2[poslinha][poscoluna]);
            }
        }

    }
}
