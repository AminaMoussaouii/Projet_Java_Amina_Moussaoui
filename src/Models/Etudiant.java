package Models;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    int id;
    private  Filiere filiere;
    ArrayList<Note> notes=new ArrayList<>();
    public Etudiant(String nom, String prenom, String email, int apogee){
        this.apogee=apogee;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
    }
    public Etudiant(){

    }

    public Filiere getFiliere() {
        return filiere;
    }

    public int getApogee() {
        return apogee;
    }

    public String getEmail() {

        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setApogee(int apogee) {

        this.apogee = apogee;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNote(ArrayList<Note> notes){
        this.notes=notes;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setId(int eTdId) {
    }
    public int getId(){
        return id;
    }
}
