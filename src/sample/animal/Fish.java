package sample.animal;

public abstract class Fish extends Chordate implements Aquatic {
    public Fish(){
    }

    public Fish(String sciName, String popName, int lifeTime, double mass) {
        super(sciName, popName, lifeTime, mass);
    }
}
