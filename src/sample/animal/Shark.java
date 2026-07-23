package sample.animal;

public class Shark extends Fish {
    private int numFins;

    public Shark() {
    }

    public Shark(
            String sciName,
            String popName,
            int lifeTime,
            double mass,
            int numFins) {
        super(sciName, popName, lifeTime, mass);
        this.numFins = numFins;
    }

    @Override
    public void born() {
        System.out.println("Tubarão nascendo...");
    }

    @Override
    public void eat() {
        System.out.println("Tubarão comendo...");
    }

    @Override
    public void grows() {
        System.out.println("Tubarão crescendo...");
    }

    @Override
    public void reproduces() {
        System.out.println("Tubarão reproduzindo...");
    }

    @Override
    public void die() {
        System.out.println("Tubarão morrendo...");
    }

    public int getNumFins() {
        return numFins = numFins;
    }

    public void setNumFins(int numFins) {
        this.numFins = numFins;
    }

    @Override
    public void swim() {
        System.out.println("Tubarão nadando...");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNúmero de nadadeiras:\t" + numFins;
    }
}
