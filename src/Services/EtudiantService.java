package Services;
import Models.Etudiant;

import java.util.ArrayList;

public class EtudiantService {

    public static Etudiant addEtudiant(String nom, String prenom, String email, int apogee, int id){
        Etudiant etudiant =new Etudiant();
        etudiant.setNom(nom);
        etudiant.setApogee(apogee);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);
        etudiant.setId(DB.getETdId());
        DB.etudiants.add(etudiant);
        return etudiant;
    }

    public static Etudiant updateEtudiant(String nom, String prenom,String email,int apogee,int id){
        for (Etudiant etudiant: DB.etudiants){
            if(etudiant.getId()==id){
                etudiant.setEmail(email);
                etudiant.setNom(nom);
                etudiant.setPrenom(prenom);
                etudiant.setApogee(apogee);
                return etudiant;

            }
        }
        return new Etudiant();
    }

    public static Etudiant removeEtudiant(int id){
        for (Etudiant etudiant: DB.etudiants){
            if(etudiant.getId()==id){
                DB.etudiants.remove(id);
            }
        }
        return new Etudiant();
    }
     public static ArrayList<Etudiant> getTousEtudiants(){
        return DB.etudiants;
     }

}
