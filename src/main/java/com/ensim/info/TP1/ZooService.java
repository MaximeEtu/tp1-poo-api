package com.ensim.info.TP1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZooService implements IZooService {
    @Autowired
    IZooDao zooDao;

    ZooService() {

    }

    public IZooDao getZooDao() {
        return zooDao;
    }

    public void setZooDao(IZooDao zooDao) {
        this.zooDao = zooDao;
    }

    public int getVisiteurs() {
       return zooDao.getVisiteurs();
    }

    public void ajouterSecteur(TypeAnimal typeAnimal) {
        zooDao.ajouterSecteur(typeAnimal);
    };
    public void nouveauVisiteur() throws LimiteVisiteurException {
        zooDao.nouveauVisiteur();
    };
    public int getLimiteVisiteur() {
        return zooDao.getLimiteVisiteur();
    }
    public void nouvelAnimal(Animal animal) {
        zooDao.nouvelAnimal(animal);
    }
    public int nombreAnimaux() {
        return zooDao.nombreAnimaux();
    }
    public List<Secteur> getSecteursAnimaux() {
        return zooDao.getSecteursAnimaux();
    }
}
