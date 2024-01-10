package controllers;

import Main.Main;

public class NoteController {
    public static void Menu() {
        System.out.println("CHOISISSEZ UN NOMBRE POUR LA GESTION DES NOTES");
        System.out.println("1: Pour ajouter une nouvelle note");
        System.out.println("2: Pour afficher les notes des etudiants");
        System.out.println("3: Pour modifier une note d'un etudiant par son id ");
        System.out.println("4: Pour supprimer un note ");
        System.out.println("0: Pour retourner au menu principal");
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                // AjouterNote();
                break;
            case 2:
                //  showNotess();
                break;
            case 3:
                //   editNote();
                break;
            case 4:
                // destroyNote();
                break;
            default:
                Main.showPrincipalMenu();

        }
    }
}
