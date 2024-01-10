package Models;

import java.util.ArrayList;

public class Filiere {
    private String intitule;
    private int id;
    private Enseignant responsable;
    private Departement departement;
    ArrayList<Filiere> filieres;
    ArrayList<Module> modules;
    public Filiere(String intitule, Departement departement , Enseignant responsable){
        this.departement=departement;
        this.intitule=intitule;
        this.responsable=responsable;
    }
    public Filiere(){

    }

    public static void setEnseignant(Enseignant responsable) {
    }

    public Departement getDepartement() {
        return departement;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public String getIntitule() {
        return intitule;
    }

    public static void setDepartement(Departement departement) {
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Filiere> getFilieres() {
        return filieres;
    }
    public static void setId(int id){
    }
    public int getId(){
        return id;
    }
}
