package main;

public class ConcClass1 {
    private int key;

    public ConcClass1() {
        key = 1234;
    }

    public ConcClass1(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey (int key) {
        this.key = key;
    }
}
