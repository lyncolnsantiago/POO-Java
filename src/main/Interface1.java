package main;

public interface Interface1 {
    boolean INTERFACE_VAR = true;

    default void interfaceMethod1() {
        System.out.println("Metodo 1 da interface 1!");
        interfaceMethod3();
    }

    void interfaceMethod2();

    private void interfaceMethod3() {
        System.out.println("Metodo privados também são permitidos nas interfaces!");
    }
}
