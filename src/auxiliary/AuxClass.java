package auxiliary;

import main.Interface1;
import main.Interface2;

public class AuxClass implements Interface1, Interface2 {
    @Override
    public void interfaceMethod2() {
        System.out.println("Metodo 2 da interface 1!");
    }
}
