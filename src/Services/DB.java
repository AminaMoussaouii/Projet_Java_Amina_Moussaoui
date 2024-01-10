package Services;
import Models.*;
import Models.Module;
import java.util.ArrayList;
public class DB {
    public static int departemenId = 0;
    public static int EnseignantId = 0;
    public static int EtudiantId = 0;
    public static int FiliereId = 0;
    public static int ModuleId = 0;
    public static ArrayList<Departement> departements = new ArrayList<Departement>();
    public static ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
    public static ArrayList<Filiere> filieres = new ArrayList<Filiere>();
    public static ArrayList<Module> modules = new ArrayList<Module>();
    public static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    public static ArrayList<Note> notes = new ArrayList<Note>();

    public  static int getDeptId(){
        departemenId++;
        return departemenId;
    }
    public  static int getEnsId(){
        EnseignantId++;
        return EnseignantId;
    }
    public  static int getModId(){
        ModuleId++;
        return ModuleId;
    }
    public  static int getFelId(){
        FiliereId++;
        return FiliereId;
    }
    public  static int getETdId(){
        EtudiantId++;
        return EtudiantId;
    }


}
