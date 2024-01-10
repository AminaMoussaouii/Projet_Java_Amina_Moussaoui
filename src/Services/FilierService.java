package Services;
import Models.*;

import java.util.ArrayList;

public class FilierService {

    public  static Filiere addFiliere(String intitule, int id, Enseignant responsable, Departement departement){
       Filiere filiere =new Filiere();
       // Filiere.setIntitule(intitule);
        Filiere.setDepartement(departement);
        Filiere.setEnseignant(responsable);
        Filiere.setId(DB.getFelId());
        DB.filieres.add(filiere);
        return filiere;
    }

    public static Filiere updateFiliere(String intitule, int id){
        for (Filiere filiere: DB.filieres){
            if(filiere.getId()==id){
                filiere.setIntitule(intitule);
                return filiere;

            }
        }
        return new Filiere();
    }

    public Filiere removeFiliere(int id){
        for (Filiere filiere: DB.filieres){
            if(filiere.getId()==id){
                DB.filieres.remove(id);
            }
        }
        return new Filiere();
    }
    public ArrayList<Filiere> getTousFilieres(){
        return DB.filieres;
    }



}
