import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionModules gestionModules = new GestionModules();
        GestionCours gestionCours = new GestionCours();

        boolean continuer = true;
        while (continuer) {
            System.out.println("Choisissez une option : ");
            System.out.println("1. Ajouter un module");
            System.out.println("2. Lister les modules");
            System.out.println("3. Créer un cours");
            System.out.println("4. Lister tous les cours");
            System.out.println("5. Lister les cours d’un module et d’un professeur");
            System.out.println("6. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le retour à la ligne

            switch (choix) {
                case 1:
                    // Logique pour ajouter un module
                    break;
                case 2:
                    // Logique pour lister les modules
                    break;
                case 3:
                    // Logique pour créer un cours
                    break;
                case 4:
                    // Logique pour lister tous les cours
                    break;
                case 5:
                    // Logique pour lister les cours d’un module et d’un professeur
                    break;
                case 6:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }
        }
    }
}
