package controllers;
import Main.Main;
import Models.Etudiant;
import Services.EtudiantService;

import static Services.EtudiantService.updateEtudiant;

public class EtudiantController {
    public static void Menu() {
        System.out.println("CHOISISSEZ UN NOMBRE POUR LA GESTION DES ETUDIANTS");
        System.out.println("1: Pour ajouter un nouveau etudiant");
        System.out.println("2: Pour afficher etudiant");
        System.out.println("3: Pour modifier un etudiant existant par son id ");
        System.out.println("4: Pour supprimer un etudiant existant ");
        System.out.println("0: Pour retourner au menu principal");
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
               // createEtudiant();
                break;
            case 2:
              //  showEtudiants();
                break;
            case 3:
             //   editEtudiant();
                break;
            case 4:
               // destroyEtudiant();
                break;
            default:
                Main.showPrincipalMenu();

        }
    }
}
