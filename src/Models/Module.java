package Models;
public class Module {
    private  String intitule;
    private int id;
    private Enseignant professeur;
    private Filiere filiere;
 public Module(String intitle , Enseignant professeur, Filiere filiere){
     this.intitule=intitule;
     this.professeur=professeur;
     this.filiere=filiere;
 }
 public Module(){

 }

    public static void setEnseignant(Enseignant professeur) {
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public static void setIntitule(String intitule) {
        intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public static void setFiliere(Filiere filiere) {
        filiere = filiere;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }
    public static void setId(int id){

    }
    public int getId(){
     return id;
    }


}
