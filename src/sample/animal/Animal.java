package sample.animal;

public abstract class Animal {
    private String sciName;
    private String popName;
    private int lifeTime;
    private double mass;

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
}
