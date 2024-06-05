import java.util.ArrayList;
import java.util.List;

class Module {
    private int id;
    private String nom;

    // Constructeur, getters, setters
}

class GestionModules {
    private List<Module> modules;

    public GestionModules() {
        modules = new ArrayList<>();
    }

    public void ajouterModule(Module module) {
        // Ajouter le module à la liste des modules
        modules.add(module);
    }
}
