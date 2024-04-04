package br.ufpb.dcx.zoologico;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, especie, idade);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
            return  "Animal : "+ this.nome+"\nEspécie : "+this.especie+"\nIdade: "+this.idade;
    }
}
