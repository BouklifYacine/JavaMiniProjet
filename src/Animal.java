public class Animal {

    String vivant = "Vivant";
    String prenom;

    void Sante() {
        System.out.println("L'animal est : " + this.vivant);
    }

    void Test(){
        System.out.println("Test Overide");
    }

    Animal(String prenom) {
        this.prenom = prenom;
    }

}
