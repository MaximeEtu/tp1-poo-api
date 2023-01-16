package com.ensim.info.TP1;

import java.util.List;

public interface IZooService {

    int getVisiteurs();
    void ajouterSecteur(TypeAnimal typeAnimal);
    void nouveauVisiteur() throws LimiteVisiteurException;
    int getLimiteVisiteur();
    void nouvelAnimal(Animal animal);
    int nombreAnimaux();
    List<Secteur> getSecteursAnimaux();
}
