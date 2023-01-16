package com.ensim.info.TP1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooServiceTest {

    private static ZooDao zooDao;
    private static Animal animal;

    @BeforeAll
    public static void init() {
        zooDao = new ZooDao(15);
        zooDao.ajouterSecteur(TypeAnimal.CHIEN);
    }


    @Test
    void testNouveauVisiteur() throws LimiteVisiteurException {
        for (int i = 0; i < 14; i++) {
            zooDao.nouveauVisiteur();
        }

        // Le quinzième
        Exception e = assertThrows(LimiteVisiteurException.class, () -> {
            zooDao.nouveauVisiteur();
        });
        assertEquals("Nombre de visiteurs max atteint", e.getMessage(), "Message d'erreur correct");
    }


    @Test
    void testNouvelAnimal() {
        Chien c = new Chien("Pipy");
        zooDao.nouvelAnimal(c);

        // Donc dans le secteur chien, on doit retrouver Pipy
        List<Secteur> secteurList = zooDao.getSecteursAnimaux();
        for (Secteur s : secteurList) {
            if (s.obtenirType() == c.getTypeAnimal()) {
                List<Animal> animalList = s.getAnimauxDansSecteur();
                boolean isAnimalInList = animalList.contains(c);

                assertEquals(true, isAnimalInList, "Pipy est bien dans le bon secteur");

            }
        }
    }
}