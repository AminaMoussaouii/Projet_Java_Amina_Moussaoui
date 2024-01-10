package Models;

import java.util.ArrayList;

public class Departement {
   private String intitule;
   private int id;
   private Enseignant responsable;
   ArrayList<Filiere> filieres = new ArrayList<>();

   public Departement() {
   }

   ;

   public Departement(String intitule) {
      this.intitule = intitule;
   }

   public Departement(String intitule, Enseignant responsable) {
      this.intitule = intitule;
      this.responsable = responsable;
   }

   public void setIntitule(String intitule) {
      this.intitule = intitule;
   }

   public void setResponsable(Enseignant responsable) {
      this.responsable = responsable;
   }

   public String getIntitule() {
      return intitule;
   }

   public Enseignant getResponsable() {
      return responsable;
   }

   public ArrayList<Filiere> getFilieres() {
      return filieres;
   }

   public void setFilieres(ArrayList<Filiere> filieres) {

   }

   public void setId(int id) {
      this.id = id;
   }

   public int getId() {
      return id;
   }
}
