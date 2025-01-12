import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = { "Quel est le meilleur FPS?", "Qui est le meilleur DC de l'histoire du foot? ",
                "Quel est le prénom de Hbiba? " };

        String[][] options = {
                { "1. Valorant ", "2. CSGO ", "3. COD" },
                { " 1. Van Dijk ", "2. Sergio Ramos ", "3. Maldini " },
                { "1. Cassandra", "2. Candice", "3. Norhane" } };

        int[] reponses = { 2, 1, 3 };
        int score = 0;
        int choix;

        System.out.println("***************************");
        System.out.println("Bienvenue dans le QUIZZ de Yacine le TRIBAL CHIEF !!! ");
        System.out.println("***************************");

        for(int i = 0 ; i <questions.length ; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.println("Rentrez votre choix");
            choix = scanner.nextInt();

            if(choix == reponses[i]){
                System.out.println("***************************");
                System.out.println("Bonne réponse !!! ");
                System.out.println("***************************");
                    score++;
            }
            else {
                System.out.println("***************************");
                System.out.println("Mauvaise Réponse !!!");
                System.out.println("***************************");
            }

            System.out.println("Votre Score final est de " + score + " sur " + questions.length);
        }

        scanner.close();
    }
}
