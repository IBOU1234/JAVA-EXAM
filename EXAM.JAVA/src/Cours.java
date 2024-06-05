public class Cours {
    import java.time.LocalDate;
    import java.time.LocalTime;
        private int id;
        private LocalDate date;
        private LocalTime heureDebut;
        private LocalTime heureFin;
        private Professeur professeur;
        private Module module;
    
        // Constructeur, getters, setters
    }
    
    class GestionCours {
        private List<Cours> cours;
    
        public GestionCours() {
            cours = new ArrayList<>();
        }
    
        public void creerCours(Cours cours) {
            // Ajouter le cours à la liste des cours
            cours.add(cours);
        }
    }
    
}
import java.util.ArrayList;
import java.util.List;
