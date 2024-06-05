public class Gestioncrsmodul {
    class GestionCours {
        // Autres méthodes...
    
        public void listerCoursModuleProfesseur(Module module, Professeur professeur) {
            for (Cours cours : cours) {
                if (cours.getModule().equals(module) && cours.getProfesseur().equals(professeur)) {
                    System.out.println("Cours ID: " + cours.getId() + ", Date: " + cours.getDate() + ", Heure début: " + cours.getHeureDebut() + ", Heure fin: " + cours.getHeureFin());
                }
            }
        }
    }
    
}
