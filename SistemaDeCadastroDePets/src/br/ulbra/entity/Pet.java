/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.entity;

/**
 *
 * @author aluno.saolucas
 */
public class Pet {
 private int id;
 private String nomePet;
 private String raca;
 private String anoNascimento;
 private String sexo;
 private String corPelo;

 public Pet(){
     
 }
 
 
 
    public Pet(int id, String nomePet, String raca, String anoNascimento, String sexo, String corPelo) {
        this.id = id;
        this.nomePet = nomePet;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.corPelo = corPelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
    
    
    
    
    
}
