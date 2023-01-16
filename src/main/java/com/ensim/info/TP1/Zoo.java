package com.ensim.info.TP1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParSecteur;

    public Zoo(int nbVisiteurMaxParSecteur) {
        secteursAnimaux = new ArrayList<Secteur>();
        this.visiteurs = 0;
        this.nbVisiteurMaxParSecteur = nbVisiteurMaxParSecteur;
    }

    public void ajouterSecteur(TypeAnimal typeAnimal) {
        this.secteursAnimaux.add(new Secteur(typeAnimal));
    }

    public void nouveauVisiteur() throws LimiteVisiteurException {

        if (this.nbVisiteurMaxParSecteur*this.secteursAnimaux.size() == this.visiteurs+1) {
            throw new LimiteVisiteurException("Nombre de visiteurs max atteint");
        }
        this.visiteurs++;
    }

    public int getLimiteVisiteur() {
        return nbVisiteurMaxParSecteur;
    }

    public void nouvelAnimal(Animal animal) {
        // récupérer le type de l'animal en paramètre
        // récupérer le secteur correspondant à ce type
        // ajouter l'animal dans la liste d'animaux de ce secteur
        for (Secteur s : secteursAnimaux) {
            if (s.obtenirType() == animal.getTypeAnimal()) {
                s.ajouterAnimal(animal);
            }
        }
    }

    public int nombreAnimaux() {
        // somme de getNombreAnimaux de
        int somme = 0;
        for (Secteur s : secteursAnimaux) {
            somme += s.getNombreAnimaux();
        }
        return somme;
    }

    public List<Secteur> getSecteursAnimaux() {
        return secteursAnimaux;
    }
}
