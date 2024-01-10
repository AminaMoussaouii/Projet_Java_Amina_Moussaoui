package Services;
import Models.Departement;
import Models.Enseignant;
import java.util.ArrayList;
public class DepartementService {

    public static Departement addDepartment(String intitule, Enseignant responsable){
        Departement departement = new Departement();
        departement.setIntitule(intitule);
        departement.setId(DB.getDeptId());
        if (responsable.length > 0){
           // departement.setResponsable(responsable[0]);
        }
        DB.departements.add(departement);

        return departement;
    }
    public static Departement updateDepartment(String intitule,int id,Enseignant responsable[]) {
        for (Departement departement : DB.departements) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (responsable.length > 0) {
                    departement.setResponsable(responsable[0]);
                }
                return departement;
            }
        }
        return new Departement();

    }
    public static Departement removeDepartment(int id) {
        for (Departement departement : DB.departements) {
            if (departement.getId() == id) {
                DB.departements.remove(id);
            }
          return departement;
        }
        return new Departement();
    }

        public static ArrayList<Departement> getAllDeptartements () {

            return DB.departements;
        }

}
