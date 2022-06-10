package lesson2.task2;

public final class Workstation extends Laptop {
    private final boolean mouse;

    public Workstation(boolean CPU, boolean GPU, boolean screen, boolean mouse) {
        super(CPU, GPU, screen);
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "mouse=" + mouse +
                '}' + super.toString();
    }
}
