package sample.animal;

public class Shark extends Fish {
    private int numFins;

    public void setNumFins(int numFins) {
        this.numFins = numFins;
    }

    public int getNumFins() {
        return numFins;
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
}
