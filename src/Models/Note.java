package Models;

public class Note {
    private Etudiant etudiant;
    private Module module;
    private double note;
    public Note(Etudiant etudiant, Module module, Double note){
        this.etudiant=etudiant;
        this.note=note;
        this.module=module;
    }
    public Note(){

    }

    public double getNote() {
        return note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Module getModule() {
        return module;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void setModule(Module module) {
        this.module = module;
    }

}
