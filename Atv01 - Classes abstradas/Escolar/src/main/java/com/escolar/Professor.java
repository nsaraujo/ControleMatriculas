/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escolar;

import java.util.Objects;

/**
 *
 * @author 55649
 */
public class Professor extends Pessoa {
    private String formacao;

    public Professor(String formacao, String nome, int matricula, String disciplina) {
        super(nome, matricula, disciplina);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.formacao);
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
        final Professor other = (Professor) obj;
        return Objects.equals(this.formacao, other.formacao);
    }

    @Override
    public String toString() {
        return nome + ", N° de matricula = " + matricula + ", formação = " + formacao;
    }
}
