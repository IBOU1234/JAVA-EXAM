public class gestioncours {
    class GestionCours {
        // Autres méthodes...
    
        public void listerTousLesCours() {
            for (Cours cours : cours) {
                System.out.println("Cours ID: " + cours.getId() + ", Date: " + cours.getDate() + ", Heure début: " + cours.getHeureDebut() + ", Heure fin: " + cours.getHeureFin());
            }
        }
    }
    
}
