package lesson2.task3;

public abstract class Papirus {
    public boolean oak;
    public boolean birch;

    public boolean isOak() {
        return oak;
    }

    public void setOak(boolean oak) {
        this.oak = oak;
    }

    public boolean isBirch() {
        return birch;
    }

    public void setBirch(boolean birch) {
        this.birch = birch;
    }

    public Papirus(boolean oak, boolean birch) {
        this.oak = oak;
        this.birch = birch;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "oak=" + oak +
                ", birch=" + birch +
                '}';
    }
}
