public class Voiture {

    static int nombrevoiture;
    int nombre = 27;
    String marque = "Ford";
    String carburant = "Diesel";
    int Annee = 2025;

    void tuto(){
        System.out.println("Tu as commencé ce tuto de la POO en : " + Annee);
    }

    Voiture(int nombre, String marque , String carburant){
        this.nombre = nombre;
        this.marque = marque ; 
        this.carburant = carburant;
       
    };

 
   void Fonction(){
System.out.println("Son carburant est : " + this.carburant);
    }

     void Voiturechiffre(){
        System.out.println("Le nombre de voiture est de : " + this.marque);
            }
    
}

