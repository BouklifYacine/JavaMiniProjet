public class Chien implements Animal, Carnivore {

    @Override
    public void poil() {
        System.out.println("Le chien a des poils ");
    };

    @Override
    public void carnivore(){
        System.out.println("Le chien est aussi Carnivore");
    };
}
