package day04;

public class GasStation {
    private double price;

    public GasStation(double price) {
        this.price = price;
    }

    public double fillTank(String car, int size) {
            return price * size;
        }
}
