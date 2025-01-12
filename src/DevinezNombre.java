import java.util.Scanner;
import java.util.Random;

public class DevinezNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreadeviner = random.nextInt(1,11);
        int tentative = 0; 
        int maxtentative = 3;
        int tentativerestante;

        System.out.println("Devinez un nombre entre 1 et 10");

        while (tentative < maxtentative) {
            System.out.print("Entrez un nombre : ");
            int nombre = scanner.nextInt();

            if (nombre == nombreadeviner) {
                System.out.println("Bravo, vous avez trouvé le nombre !");
                break; 
            } else {
                tentative++;
                tentativerestante = maxtentative - tentative;
                System.out.println("Incorrect. Il vous reste " + tentativerestante + " tentatives.");
            }
        }

        if (tentative == maxtentative) {
            System.out.println("Vous avez perdu. Le nombre était : " + nombreadeviner);
        }

        scanner.close();
    }
}