package sample.animal;

public class AnimalTester {
    public static void main(String[] args) {
        /*Shark shark1 = new Shark();
        shark1.setSciName("Galeocerdo cuvier");
        shark1.setPopName("Tubarão tigre");
        shark1.setLifeTime(70);
        shark1.setMass(400.0);
        shark1.setNumFins(4);*/

        Shark shark1 = new Shark(
                "Galeocerdo cuvier",
                "Tubarão Tigre",
                70,
                400.0,
                4
        );

        System.out.println(shark1);

        /*System.out.println(shark1.getSciName());
        System.out.println(shark1.getPopName());
        System.out.println(shark1.getLifeTime());
        System.out.println(shark1.getMass());
        System.out.println(shark1.getNumFins());

        shark1.born();
        shark1.eat();
        shark1.grows();
        shark1.reproduces();
        shark1.die();
        shark1.swim();*/
    }
}
