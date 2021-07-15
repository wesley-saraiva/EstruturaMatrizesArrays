/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wesle
 */
public class SplitArray {

    public static void main(String[] args) {

        String texto = "wesley, curso Java, 80, 70, 60, 52";

        String[] valoresArray = texto.split(",");

        System.out.println("Nome: " + valoresArray[0]);
        System.out.println("Curso: " + valoresArray[1]);
        System.out.println("Nota1: " + valoresArray[2]);
        System.out.println("Nota2: " + valoresArray[3]);
        System.out.println("Nota3: " + valoresArray[4]);
        System.out.println("Nota4: " + valoresArray[5]);

        //Convertendo um Array em uma lista
        List<String> list = Arrays.asList(valoresArray);

        for (String valorString : list) {
            System.out.println(valorString);
        }
        System.out.println("====================================");
        //Convertendo uma lista para um Array
        String[] converterArray = list.toArray(new String[6]);

        for (int i = 0; i < converterArray.length; i++) {
            System.out.println(converterArray[i]);
        }
        String text2 = "Pedro, C#, 50, 85, 63, 40 ";
        
        String[] valoresArays2 = text2.split(",");
        
        List<String> list2 = Arrays.asList(valoresArays2);
        
        for (String valorString2 : list2) {
            System.out.println("Valor List: "+valorString2);
        }
        System.out.println("================================");
        String[] converterArray2 = list.toArray(new String[6]);
        
        for(int i=0; i <converterArray2.length;i++){
            System.out.println("Valor Array: "+valoresArays2[i]);
        }
        System.out.println("======================================");
        String text3 = "Jose, C++, 50, 74, 60, 40";
        
        String [] valoresArrays3 = text3.split(",");
        
        List<String> list3 = Arrays.asList(valoresArrays3);
        
        for (String valorString3 : list3) {
            System.out.println("Valor List: "+valorString3);
        }
        System.out.println("==================================");
        String[] converterArrays3 = list.toArray(new String[6]);
        
        for (int i = 0; i < converterArrays3.length; i++) {
            System.out.println("Valor arrays: "+valoresArrays3[i]);
        }
        
        String text4 = "Carlos, Banco, 41, 65, 63, 85";
        String [] valoresArrays4 = text4.split(",");
        
        List<String> list4 = Arrays.asList(valoresArrays4);
        System.out.println("==================================");
        for (String valorString4 : list4) {
            System.out.println("Valor List: "+valorString4);
        }
        String[] converterArray4 = list.toArray(new String[6]);
        System.out.println("====================================");
        for (int l = 0; l < converterArray4.length; l++) {
            System.out.println("valor Array: "+valoresArrays4[l]);
        }
        
    }
}
