package main;

public class ConcClass extends AbstClass {
    public int key = 5555;

    @Override
    public void sayHello() {
        System.out.println("E ai, mano!");
    }

    public void originalSayHello() {
        super.sayHello();
    }

    @Override
    public void sayHi() {
        System.out.println("Oi!");
    }
}
