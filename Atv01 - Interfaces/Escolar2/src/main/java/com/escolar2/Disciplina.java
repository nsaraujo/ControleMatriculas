/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escolar2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 55649
 */
public class Disciplina implements Secretaria {

    private String nomeDisciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nomeDisciplina, Professor professor, Aluno aluno) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }

    public Disciplina() {
        this.alunos = new ArrayList<>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public Date data() {
        return new Date();
    }

    @Override
    public void matriculaAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.addDisciplina(this.nomeDisciplina);
        System.out.println("O aluno(a): " + aluno.getNome() + " ingressou na Disciplina: " + getNomeDisciplina());
    }

    @Override
    public void encerraMatricula(Aluno aluno) {
        this.alunos.remove(aluno);
        aluno.removeDisciplina(this.nomeDisciplina);
        System.out.println("O aluno(a): " + aluno.getNome() + " teve a matricula encerrada na "
                + "Disciplina: " + getNomeDisciplina());
    }

    @Override
    public void matriculasAtiva(ArrayList<Aluno> alunos) {
        System.out.println("Alunos matriculados na Disciplina: " + this.alunos);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nomeDisciplina);
        hash = 79 * hash + Objects.hashCode(this.professor);
        hash = 79 * hash + Objects.hashCode(this.alunos);
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
        if (!Objects.equals(this.nomeDisciplina, other.nomeDisciplina)) {
            return false;
        }
        if (!Objects.equals(this.professor, other.professor)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nomeDisciplina=" + nomeDisciplina + ", professor=" + professor + ", alunos=" + alunos + '}';
    }

}
