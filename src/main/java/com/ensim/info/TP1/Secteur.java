package com.ensim.info.TP1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {

    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur;

    public Secteur(TypeAnimal typeAnimal) {
        this.animauxDansSecteur = new ArrayList<Animal>();
        this.typeAnimauxDansSecteur = typeAnimal;
    }

    public void ajouterAnimal(Animal animal) {
        animauxDansSecteur.add(animal);
    }
    public int getNombreAnimaux() {
        return animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType() {
        return typeAnimauxDansSecteur;
    }

    public List<Animal> getAnimauxDansSecteur() {
        return animauxDansSecteur;
    }
}
