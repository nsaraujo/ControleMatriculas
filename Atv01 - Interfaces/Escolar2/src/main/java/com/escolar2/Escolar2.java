/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.escolar2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 55649
 */
public class Escolar2 {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        Disciplina datas = new Disciplina();
        Date data = datas.data();
        System.out.println("Data atual: " + data);
        

        Professor professor1 = new Professor("Bacharel TSI", "Jõao", 104, "Padrões de Projeto");
        System.out.println("Professor da Disciplina: " + professor1);
        
        
        Aluno aluno1 = new Aluno("5", "Nicolas", 01, "Padrões de projeto");
        

        Disciplina disciplina1 = new Disciplina("Padrões de Projeto", professor1, aluno1);
        disciplina1.matriculaAluno(aluno1);
        

        Aluno aluno2 = new Aluno("5", "Amanda", 02, "Padrões de projeto");
        disciplina1.matriculaAluno(aluno2);
        
        
        Aluno aluno3 = new Aluno("5", "Maria Eduarda", 03, "Padrões de projeto");
        disciplina1.matriculaAluno(aluno3); 
        
        
        disciplina1.encerraMatricula(aluno1);
        
        
        disciplina1.matriculasAtiva(alunos); 
    }
}
