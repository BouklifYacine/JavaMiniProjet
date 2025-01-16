import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Poo1 {
  public static void main(String[] args) {

    Animal animal = new Animal("Pitbull", "Noir", 10);

    animal.setCouleur("Multicolor");
    animal.setPrix(100000);

    System.out.println(animal.getRace() + " " + animal.getCouleur() + " " + " " + animal.getPrix());

    ArrayList<Integer> tableau = new ArrayList<>();

    tableau.add(400);
    tableau.add(6);
    tableau.add(9);

    int nombre = tableau.get(1);
    System.out.println(nombre);

    System.out.println(tableau);

    tableau.remove(2);

 System.out.println(tableau);

 tableau.set(1, 50);
 System.out.println(tableau);


 if(tableau.contains(50)){
  System.out.println("Y'a bien 50 dans cette liste");
 }
 else {
  System.out.println("Y'a pas 50 ");
 }

tableau.forEach(elements -> System.out.println(elements));
tableau.sort((a, b) -> a.compareTo(b));
System.out.println(tableau);

int index = tableau.indexOf(50);
System.out.println(index);

tableau.size();

String chemin = "F:\\Documents\\test.txt";

try {BufferedReader reader = new BufferedReader(new FileReader(chemin));
  System.out.println("Le fichier est lu");
  String ligne; 
  while ((ligne = reader.readLine()) != null){
    System.out.println(ligne);
  }
} catch (Exception error) {
  System.out.println("Voici l'erreur de la lecture : " + error);
}


  }

}
