package com.mero.metier;

import com.mero.dao.Etudiant;
import com.mero.dao.EtudiantDAODictionary;
import com.mero.dao.IEtudiantDAO;

import java.util.List;
import java.util.Map;

public class EtudiantManagerDictionary {
    public IEtudiantDAO etudiantDAO;

    public EtudiantManagerDictionary(IEtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantDAO.addEtudiant(etudiant);
    }
    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
    public void updateEtudiant(String id, Etudiant etudiant) {
        etudiantDAO.updateEtudiant(id, etudiant);
    }}
