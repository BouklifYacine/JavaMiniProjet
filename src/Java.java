import java.util.Scanner;
class Temperature {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double Temperature;
        double nouvelletemperature;
        String unite;

        System.out.println("Rentrez votre température :");
        Temperature = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Rentrez votre unité : (C/F) ");
        unite = scanner.nextLine();

        if(unite.equalsIgnoreCase("C")) {
            nouvelletemperature = Temperature * 1.8 + 32;
            System.out.println(nouvelletemperature);
        }
        else if (unite.equalsIgnoreCase("F")){
            nouvelletemperature = (Temperature - 32) / 1.8;
            System.out.println(nouvelletemperature);
        }
        else{
            System.out.println("Vous devez choisir entre Celsius (C) ou Fahreneit(F)");
        }

        scanner.close();
    }
}