public class Zebra extends Animal{

    public Zebra(){
        numLegs = 4;
        numEyes = 2;
    }

    @Override
    public void makeSound() {
        System.out.println("i neigh");
    }

    @Override
    public void howFast() {
        System.out.println("I am fast");
    }
}
