import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nourriture;
        int nombre;

       
        System.out.println("Combien de nourriture veux-tu ajouter à ton plat ?");
        nombre = scanner.nextInt();

        scanner.nextLine();

        nourriture = new String[nombre];
        
        for (int i = 0; i < nourriture.length; i++) {
            System.out.println("Entrez une nourriture :");
            nourriture[i] = scanner.nextLine();
            System.out.println("Nourriture ajoutée : " + nourriture[i]); 
        }

        System.out.println("\nListe des nourritures dans ton plat :");
        
        for (String graille : nourriture) {
            System.out.println(graille);
        }

        scanner.close();
    }
}