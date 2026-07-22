package main;

public abstract class AbstClass implements Interface1, Interface2 {
    public int key;

    public AbstClass() {
        key = 9999;
    }

    public AbstClass(int key) {
        this.key = key;
    }

    public void sayHello() {
        System.out.println("Olá!");
    }

    public abstract void sayHi();

    @Override
    public void interfaceMethod2() {
        System.out.println("Metodo 2 da interface 1!");
    }
}
