package controllers;
import Models.Departement;
import Services.DepartementService;
import Services.EnseignantService;
import Models.Enseignant;
import Services.DB;
import Main.Main;

public class EnseignatController {
    public static void Menu(){
        System.out.println("CHOISISSEZ UN NOMBRE POUR LA GESTION DES ENSEIGNANTS");
        System.out.println("1: Pour ajouter un nouveau enseignant");
        System.out.println("2: Pour afficher les enseignants");
        System.out.println("3: Pour modifier un enseignant existant par son id ");
        System.out.println("4: Pour supprimer un enseignant existant ");
        System.out.println("0: Pour retourner au menu principal");
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createEnseignant();
                break;
            case 2:
                showEnseignants();
                break;
            case 3:
                editEnseignant();
                break;
            case 4:
                destroyEnseignant();
                break;
            default:
                Main.showPrincipalMenu();

      }
    }
    public static void showEnseignants(){
        for (Enseignant enseignant : DB.enseignants) {
            System.out.print("Id : " + enseignant.getId());
            System.out.print(" | Nom : " + enseignant.getNom() + " " + enseignant.getPrenom());
            System.out.print(" | Email : " + enseignant.getEmail() );
            System.out.println(" ");
        }
    }
    public static void createEnseignant(){
        String nom = Main.getStringInput("Entrez le nom de l'enseignant :");
        String prenom =Main.getStringInput("Entrez le prenom de l'enseignant");
        String email=Main.getStringInput("Entrez l'email d'un enseignant");
        String grade=Main.getStringInput("Entrez la grade de l'enseignant");
        String dept=Main.getStringInput("Entrez le département ou travail cet enseignant");
        EnseignantService.addEnseignant(nom,prenom,email,grade,dept);

        showEnseignants();
        Menu();

    }
    public static void editEnseignant(){
        showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignat par id :");
        String nom = Main.getStringInput("Entrez le prenom:");
        String prenom = Main.getStringInput("Entrez le nom :");
        String email = Main.getStringInput("Entrez l'email' :");
        String grade = Main.getStringInput("Entrez la grade:");
        showEnseignants();
        Menu();



    }
    public static void destroyEnseignant(){

        showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        EnseignantService.deleteEnsById(id);
        showEnseignants();

    }


}


