package controllers;
import Models.Departement;
import Services.DB;
import Services.DepartementService;
import Services.EnseignantService;
import Main.Main;
public class DepartementController {

    public static void Menu() {
        System.out.println("CHOISISSEZ UN NOMBRE POUR LA GESTION DES DEPARTEMENTS");
        System.out.println("1: Pour ajouter un nouveau département");
        System.out.println("2: Pour modifier un département existant par son id");
        System.out.println("3: Pour supprimer un département existant ");
        System.out.println("4: Pour afficher les départements");
        System.out.println("0: Pour retourner au menu principal");
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createDepartement();
                break;
            case 2:
                showDepartements();
                break;
            case 3:
                editDepartement();
                break;
            case 4:
                destroyDepartement();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void showDepartements(){
        for (Departement departement : DB.departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Intitulé : " + departement.getIntitule());
            if (! Main.isNull(departement.getResponsable())) {
                System.out.print(" | Chef : " + departement.getResponsable().getNom() + " " + departement.getResponsable().getPrenom());
            }
            System.out.println("");
        }

    }
    public static void createDepartement(){
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnseignatController.showEnseignants();
        int id = Main.getIntInput("Sélecionnez un responsable par id :");
        DepartementService.addDepartment(intitule, EnseignantService.getEnsById(id));

        showDepartements();
        Menu();


    }
    public static void editDepartement(){
        showDepartements();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        EnseignatController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un responsable par id :");

        //DepartementService.updateDepartment(intitule, id, EnseignantService.getEnsById(idEns));

        showDepartements();
        Menu();
    }
    public static void destroyDepartement(){
        showDepartements();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        DepartementService.removeDepartment(id);
        showDepartements();

    }

}
