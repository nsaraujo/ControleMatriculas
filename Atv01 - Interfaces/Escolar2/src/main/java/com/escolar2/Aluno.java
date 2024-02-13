/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escolar2;

/**
 *
 * @author 55649
 */
public class Aluno extends Pessoa {
    private String periodo;

    public Aluno(String periodo, String nome, int matricula, String disciplina) {
        super(nome, matricula, disciplina);
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    public void addDisciplina(String disciplina){
        
    }
    
    public void removeDisciplina(String disciplina){
    
    }

    @Override
    public String toString() {
        //return "Aluno{" + "periodo=" + periodo + '}';
        return "Aluno(a) = " + nome + ", N° de matricula = " + matricula + ", disciplina = " + disciplina;
    }
}
