package com.ensim.info.TP1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    private static Zoo zoo;
    private static Animal animal;

    @BeforeAll
    public static void init() {
        zoo = new Zoo(15);
        zoo.ajouterSecteur(TypeAnimal.CHIEN);
    }


    @Test
    void testNouveauVisiteur() throws LimiteVisiteurException {
        for (int i = 0; i < 14; i++) {
            zoo.nouveauVisiteur();
        }

        // Le quinzième
        Exception e = assertThrows(LimiteVisiteurException.class, () -> {
            zoo.nouveauVisiteur();
        });
        assertEquals("Nombre de visiteurs max atteint", e.getMessage(), "Message d'erreur correct");
    }


    @Test
    void testNouvelAnimal() {
        Chien c = new Chien("Pipy");
        zoo.nouvelAnimal(c);

        // Donc dans le secteur chien, on doit retrouver Pipy
        List<Secteur> secteurList = zoo.getSecteursAnimaux();
        for (Secteur s : secteurList) {
            if (s.obtenirType() == c.getTypeAnimal()) {
                List<Animal> animalList = s.getAnimauxDansSecteur();
                boolean isAnimalInList = animalList.contains(c);

                assertEquals(true, isAnimalInList, "Pipy est bien dans le bon secteur");

            }
        }
    }
}