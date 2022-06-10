package lesson2.task2;

public final class Ultrabook extends Laptop {
    private final boolean webcam;

    public Ultrabook(boolean CPU, boolean GPU, boolean screen, boolean webcam) {
        super(CPU, GPU, screen);
        this.webcam = webcam;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "webcam=" + webcam +
                '}' + super.toString();
    }
}
