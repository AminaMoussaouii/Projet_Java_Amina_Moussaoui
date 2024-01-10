package Services;
import Models.Departement;
import Models.Enseignant;

import java.util.ArrayList;

public class EnseignantService {
    public static Enseignant addEnseignant(String nom, String prenom, String email, String grade, String dept){
        Enseignant enseignant = new Enseignant();
        enseignant.setNom(nom);
        enseignant.setPrenom(prenom);
        enseignant.setEmail(email);
        enseignant.setGrade(grade);
        enseignant.setId(DB.getEnsId());
        DB.enseignants.add(enseignant);
        return  new Enseignant();
    }

    public static Enseignant updateEnseignant(int id, String nom, String prenom, String email, String grade, Departement dept){
        for (Enseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) {
                enseignant.setNom(nom);
                enseignant.setPrenom(prenom);
                enseignant.setEmail(email);
                enseignant.setGrade(grade);
                return enseignant;
            }
        }
        return  new Enseignant();
    }
    public static ArrayList<Enseignant> deleteEnsById(int id){
        for (Enseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) {
                DB.enseignants.remove(id);
            }
        }
        return  DB.enseignants;
    }

    public static Enseignant getEnsById(int id){
        for (Enseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) return  enseignant;
        }
        return  new Enseignant();
    }

    public static ArrayList<Enseignant> getAllEns(){
        return  DB.enseignants;
    }
}
