package lesson2.task3;

public abstract class Book extends Papirus{
    private boolean ink;

    public boolean isInk() {
        return ink;
    }

    public void setInk(boolean ink) {
        this.ink = ink;
    }

    public Book(boolean oak, boolean birch, boolean ink) {
        super(oak, birch);
        this.ink = ink;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ink=" + ink +
                ", oak=" + oak +
                ", birch=" + birch +
                '}';
    }
}
