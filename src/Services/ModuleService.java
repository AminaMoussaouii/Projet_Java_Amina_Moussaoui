package Services;

import Models.Module;
import Models.Enseignant;
import Models.Filiere;

import java.util.ArrayList;

public class ModuleService {

    public  static Module addModule(String intitule, int id, Enseignant professeur, Filiere filiere){
        Module module =new Module();
        Module.setIntitule(intitule);
        Module.setFiliere(filiere);
        Module.setEnseignant(professeur);
        Module.setId(DB.getModId());
        DB.modules.add(module);
        return module;
    }

    public static Module updateModule(String intitule, int id, Enseignant professeur,Filiere filiere){
        for (Module module: DB.modules){
            if(module.getId()==id){
                module.setIntitule(intitule);
                module.setProfesseur(professeur);
                module.setFiliere(filiere);
                return module;

            }
        }
        return new Module();
    }

    public Module removeModule(int id){
        for (Module module: DB.modules){
            if(module.getId()==id){
                DB.modules.remove(id);
            }
        }
        return new Module();
    }
    public ArrayList<Module> getTousModules(){

        return DB.modules;
    }




}
