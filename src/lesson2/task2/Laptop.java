package lesson2.task2;

public abstract class Laptop extends PC {
    private boolean screen;

    public boolean isScreen() {
        return screen;
    }

    public void setScreen(boolean screen) {
        this.screen = screen;
    }

    public Laptop(boolean CPU, boolean GPU, boolean screen) {
        super(CPU, GPU);
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                '}' + super.toString();
    }
}
