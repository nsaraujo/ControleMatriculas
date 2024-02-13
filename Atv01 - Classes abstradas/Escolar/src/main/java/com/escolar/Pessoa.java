/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escolar;

/**
 *
 * @author 55649
 */
public abstract class Pessoa {
    protected String nome;
    protected int matricula;
    protected String disciplina;

    public Pessoa(String nome, int matricula, String disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", matricula=" + matricula + ", disciplina=" + disciplina + '}';
    }
}
