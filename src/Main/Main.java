package Main;

import Models.Departement;
import controllers.DepartementController;
import controllers.EnseignatController;
import controllers.EtudiantController;
import controllers.ModuleController;

import java.util.Scanner;

public class Main {
    public static boolean isNull(Object ob) {
        return ob == null;
    }

    public static int getIntInput(String... msg) {
        Scanner sc = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0)
            message = msg[0];
        System.out.print(message);
        int num = sc.nextInt();
        return num;
    }

    public static String getStringInput(String... msg) {
        Scanner sc = new Scanner(System.in);
        String message = "Entrez un texte : ";
        if (msg.length > 0)
            message = msg[0];
        System.out.print(message);

        String str = sc.nextLine();
        return str;
    }

    public static void showPrincipalMenu() {
        System.out.println("saisir votre choix");

        System.out.println("1: Pour gérer les départements");
        System.out.println("3: Pour gérer les filières");
        System.out.println("2: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

        int choix = getIntInput("Veuillez sélectionner une option : ");
        switch (choix) {
            case 1:
                  DepartementController.Menu();
                break;
            case 2:
                EnseignatController.Menu();
                break;
            case 3:
                 EtudiantController.Menu();
                break;
            case 4:
                ModuleController.Menu();
                break;
            case 5:
                //FiliereController.Menu();
                break;
            default:
        }
        switch (choix) {
            case 1:
                DepartementController.Menu();
                break;
            case 2:
                EnseignatController.Menu();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
        }

    }

    public static void main(String[] args) {
        showPrincipalMenu();
    }
}
