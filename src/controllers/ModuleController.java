package controllers;

import Main.Main;

public class ModuleController {

    public static void Menu() {
        System.out.println("CHOISISSEZ UN NOMBRE POUR LA GESTION DES MODULES");
        System.out.println("1: Pour ajouter un nouveau module");
        System.out.println("2: Pour afficher module");
        System.out.println("3: Pour modifier un module existant par son id ");
        System.out.println("4: Pour supprimer un module existant ");
        System.out.println("0: Pour retourner au menu principal");
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                // createModule();
                break;
            case 2:
                //  showModules();
                break;
            case 3:
                //   editModule();
                break;
            case 4:
                // destroyModule();
                break;
            default:
                Main.showPrincipalMenu();

        }
    }
}
