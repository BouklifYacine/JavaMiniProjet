import java.util.Scanner;

public class ApplicationBancaire {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int montant = 0; 
        boolean actif = true; 

        while (actif) { 
            System.out.println("*************************");
            System.out.println("Application Bancaire ");
            System.out.println("*************************");

            System.out.println("1. Montrez votre argent");
            System.out.println("2. Déposez de l'argent");
            System.out.println("3. Retirez de l'argent");
            System.out.println("4. Sortir de l'application");

            System.out.println("Faites votre choix : (1-4)");
            int choix = scanner.nextInt();

            if (choix == 1) {
                System.out.println("Tu as : " + montant + " euros ");
            } else if (choix == 2) {
                System.out.println("Rajoute combien tu veux rajouter sur ton compte : ");
                int montantAjouter = scanner.nextInt();
                montant += montantAjouter; 
                System.out.println("Nouveau solde : " + montant + " euros ");
            } else if (choix == 3) {
                System.out.println("Combien d'argent veux-tu retirer ? ");
                int montantRetirer = scanner.nextInt();
                if (montantRetirer > montant) {
                    System.out.println("Tu ne peux pas retirer plus que ce que tu as !");
                } else {
                    montant -= montantRetirer; 
                    System.out.println("Nouveau solde : " + montant + " euros");
                }
            } else if (choix == 4) {
                System.out.println("Tu quittes l'application.");
                actif = false; 
            } else {
                System.out.println("Choix invalide. Veuillez choisir entre 1 et 4.");
            }
        }

        scanner.close(); 
    }
}