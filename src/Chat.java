public class Chat extends Animal {

    Chat(String prenom) {
        super(prenom);
    }
    
   void bg(){
    System.out.println("Le chat est bg");
   }

   @Override
   void Test(){
    System.out.println("Overide Perso");
}

@Override 
       void connard(){
        System.out.println("Tu es un gros connard de chat");
       }
    }

