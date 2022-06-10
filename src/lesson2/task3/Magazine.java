package lesson2.task3;

public final class Magazine extends Book {
    private boolean colorInk;

    public boolean isColorInk() {
        return colorInk;
    }

    public void setColorInk(boolean colorInk) {
        this.colorInk = colorInk;
    }

    public Magazine(boolean oak, boolean birch, boolean ink, boolean colorInk) {
        super(oak, birch, ink);
        this.colorInk = colorInk;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "colorInk=" + colorInk +
                '}' + super.toString();
    }
}
