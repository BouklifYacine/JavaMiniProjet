public class Animal {

    private String race;
    private String couleur;
    private int prix;

    Animal(String race, String couleur, int prix) {
        this.couleur = couleur;
        this.prix = prix;
        this.race = race;
    }

    String getRace(){
        return this.race;
    }
    String getCouleur(){
        return this.couleur;
        
    }
    int getPrix(){

        if(this.prix <= 10){
            return 2000;
        }
        else {
            return this.prix ;
        }  
    }

    void setCouleur(String couleur){
        this.couleur = couleur;
    }

    void setPrix(int prix){
        this.prix = prix;
    }

}
