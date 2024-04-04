package br.ufpb.dcx.zoologico;

import java.util.Collection;

public interface Zoologico {
    public boolean CadastraAnimal(String nome, String especie, int idade);
    public Collection<Animal> pesquisaAnimais (String especie, int idade);
    public boolean removeAnimal(String nome);
}
