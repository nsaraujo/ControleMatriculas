/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escolar2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 55649
 */
public interface Secretaria {
    
    public Date data();
    
    public void matriculaAluno(Aluno aluno) ;
        
    public void encerraMatricula(Aluno aluno);

    public void matriculasAtiva(ArrayList<Aluno> alunos); 
       
    
}
