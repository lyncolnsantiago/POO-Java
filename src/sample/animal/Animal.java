package sample.animal;

public abstract class Animal {
    //Atributos
    private String sciName;
    private String popName;
    private int lifeTime;
    private double mass;

    //Construtores
    public Animal() {
    }

    public Animal(String sciName, String popName) {
        this.sciName = sciName;
        this.popName = popName;
    }

    public Animal (String sciName, String popName, int lifeTime, double mass) {
        /*this.sciName = sciName;
        this.popName = popName;*/
        this(sciName, popName);
        this.lifeTime = lifeTime;
        this.mass = mass;
    }

    //Métodos
    public abstract void born();

    public abstract void eat();

    public abstract void grows();

    public abstract void reproduces();

    public abstract void die();

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public String getPopName() {
        return popName;
    }

    public void setPopName(String popName) {
        this.popName = popName;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Informações do Animal:" +
                "\nNome Científico:\t\t" + sciName +
                "\nNome Popular: \t\t\t" + popName +
                "\nExpectativa de vida:\t" + lifeTime + " anos" +
                "\nExpectativa de peso:\t" + mass + " kg";
    }
}
