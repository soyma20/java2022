package lesson2.task3;

public final class Comics extends Book{
    private boolean blackInk;

    public boolean isBlackInk() {
        return blackInk;
    }

    public void setBlackInk(boolean blackInk) {
        this.blackInk = blackInk;
    }

    public Comics(boolean oak, boolean birch, boolean ink, boolean blackInk) {
        super(oak, birch, ink);
        this.blackInk = blackInk;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "blackInk=" + blackInk +
                '}' + super.toString();
    }
}
