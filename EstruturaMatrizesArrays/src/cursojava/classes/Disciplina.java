/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author wesle
 */
public class Disciplina {
    
    //Cada disciplina tera 4 notas durante o ano inteiro
    private double[] nota = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Arrays.hashCode(this.nota);
        hash = 53 * hash + Objects.hashCode(this.disciplina);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        if (!Arrays.equals(this.nota, other.nota)) {
            return false;
        }
        return true;
    }
        
    public double getMediaNotas(){
        double somaTotal =0;
        
        for (int i=0; i< nota.length;i++){
            somaTotal += nota[i]; 
        }
        return somaTotal / 4;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nota=" + nota + ", disciplina=" + disciplina + '}';
    }

}
