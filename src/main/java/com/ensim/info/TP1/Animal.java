package com.ensim.info.TP1;

public class Animal {

    private String nomAnimal;
    protected TypeAnimal typeAnimal;

    public Animal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }
}
