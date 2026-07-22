package main;

public class MainTester {
    public static void main(String[] args) {
        //Roteiro 1
        ConcClass1 cc1 = new ConcClass1();
        ConcClass2 cc2 = new ConcClass2();

        System.out.println(cc1.getKey());
        System.out.println(cc2.getKey());

        cc1.setKey(1111);
        cc2.setKey(2222);

        System.out.println(cc1.getKey());
        System.out.println(cc2.getKey());

        //Roteiro 2
        AbstClass ac = new ConcClass();
        ConcClass cc = new ConcClass();

        System.out.println(ac.key);
        System.out.println(cc.key);

        ac.sayHello();
        cc.sayHello();

        System.out.println(ac.INTERFACE_VAR);
        ac.interfaceMethod1();
        ac.interfaceMethod2();
    }
}
