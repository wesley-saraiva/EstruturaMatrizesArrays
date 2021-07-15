/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

/**
 *
 * @author wesle
 */
public class ArrayVetor2 {

    public static void main(String[] args) {

        double[] notas = {8.5, 9.4, 6.5, 6.8};
        double[] notas2 = {7.3, 6.4, 2.5, 4.8};
        //Criação do aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Wesley");
        aluno.setNomeEscola("Saraiva");

        //Criação da disciplina
        Disciplina disc = new Disciplina();
        disc.setDisciplina("java");
        disc.setNota(notas);

        aluno.getDisciplinas().add(disc);

        Disciplina disc2 = new Disciplina();
        disc2.setDisciplina("Banco");
        disc2.setNota(notas2);

        aluno.getDisciplinas().add(disc2);

        //-------------------------------------------------
        Aluno[] arrayAluno = new Aluno[1];

        arrayAluno[0] = aluno;

        for (int i = 0; i < arrayAluno.length; i++) {
            System.out.println("Nome do aluno é " + arrayAluno[i].getNome());

            for (Disciplina d : arrayAluno[i].getDisciplinas()) {
                System.out.println("Nome da disciplina: " + d.getDisciplina());

                for (int posnota = 0; posnota < d.getNota().length; posnota++) {
                    System.out.println("As nota numero :" + (posnota + 1) + " = " + d.getNota()[posnota]);
                }
            }
        }

        System.out.println("Nome do aluno = " + aluno.getNome() + "iscrito no curso"
                + aluno.getNomeEscola());
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            System.out.println("Disciplina " + disciplina.getDisciplina());
            System.out.println("As notas da disciplina são: ");

            double notaMax = 0.0;
            double notaMin = 0.0;
            for (int i = 0; i < disciplina.getNota().length; i++) {
                System.out.println("Nota " + (i + 1) + " = " + disciplina.getNota()[i]);

                if (i == 0) {
                    notaMax = disciplina.getNota()[i];
                } else {
                    if (disciplina.getNota()[i] > notaMax) {
                        notaMax = disciplina.getNota()[i];
                    }
                }
                if (i == 0) {
                    notaMin = disciplina.getNota()[i];
                } else if (disciplina.getNota()[i] < notaMin) {
                    notaMin = disciplina.getNota()[i];
                }
            }
            System.out.println("A maior nota da Disciplina:" + disciplina.getDisciplina()
                    + " de valor = " + notaMax);
            System.out.println("A menor nota da Disciplina:" + disciplina.getDisciplina()
                    + " de valor = " + notaMin);
        }

    }
}
