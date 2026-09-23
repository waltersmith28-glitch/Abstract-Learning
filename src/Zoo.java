public class Zoo {
    public static void main(String[] args) {
        Zoo a = new Zoo();
    }

    public Zoo(){
        Zebra z = new Zebra();
        System.out.println("Zebra has " + z.getNumLegs() + " legs");
        System.out.println("Zebra has " + z.getnumEyes() + " legs");
        Gorilla g = new Gorilla();
        System.out.println("Gorilla ate " + g.getBananasConsumed() + " Bananas");
        System.out.println("Gorilla weighs " + g.getWieght() + " lbs");


    }

    public void method1(){
        System.out.println("hi in method 1");
    }


}
