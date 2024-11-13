package com.mero.presentation;

import com.mero.dao.Etudiant;
import com.mero.dao.EtudiantDAO;
import com.mero.metier.EtudiantManager;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager();
        etudiantManager.setEtudiantDAO(etudiantDAO);
        // Ajout de quelques étudiants
        Etudiant etudiant1 = new Etudiant("1", "benelabdy", "merouane", "b.merouane.com");
        Etudiant etudiant2 = new Etudiant("2", "boujir", "mahmoud", "m.boujir.com");
        Etudiant etudiant3 = new Etudiant("3", "hamza", "hamza", "a.hamza.com");
        Etudiant etudiant4 = new Etudiant("4", "test", "T", "T.test.com");

        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);

        // Affichage de tous les étudiants
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }
    }
}