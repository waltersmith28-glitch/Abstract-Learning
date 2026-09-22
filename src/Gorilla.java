public class Gorilla extends Animal{

    public Gorilla(){
        numLegs = 2;
        numEyes = 2;
    }

    @Override
    public void makeSound() {
        System.out.println("i pound chest");
    }

    @Override
    public void howFast() {
        System.out.println("I am fast");
    }
}

