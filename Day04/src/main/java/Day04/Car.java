package day04;

public class Car {
    private double petrol;
    private int range;

    public void setPetrol(double petrol) {
        this.petrol = petrol;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public double consume() {
        return 100 * petrol / range;

    }
}

