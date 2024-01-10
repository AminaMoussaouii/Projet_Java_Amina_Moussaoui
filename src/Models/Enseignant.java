package Models;

import java.util.ArrayList;

public class Enseignant {
    public int length;
    private String nom;
    private int id;
    private String prenom;
    private String email;
    private String grade;
    private Departement departement;
    ArrayList<Module> modules = new ArrayList<Module>();
    public Enseignant(int id, String nom, String prenom, String email, String grade, Departement departement){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.grade=grade;
        this.departement=departement;
    }
    public Enseignant(){

    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public void setDepartement(Departement departement){
        this.departement=departement;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getEmail(){
        return email;
    }
    public String getGrade(){
        return grade;
    }
    public String getNom(){
        return nom;
    }
    public Departement getDepartement(){
        return departement;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
