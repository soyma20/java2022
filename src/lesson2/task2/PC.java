package lesson2.task2;

public abstract class PC {
    private boolean CPU;
    private boolean GPU;

    public boolean isCPU() {
        return CPU;
    }

    public void setCPU(boolean CPU) {
        this.CPU = CPU;
    }

    public boolean isGPU() {
        return GPU;
    }

    public void setGPU(boolean GPU) {
        this.GPU = GPU;
    }

    public PC(boolean CPU, boolean GPU) {
        this.CPU = CPU;
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "PC{" +
                "CPU=" + CPU +
                ", GPU=" + GPU +
                '}';
    }
}
