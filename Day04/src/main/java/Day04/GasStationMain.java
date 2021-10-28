package day04;

public class GasStationMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPetrol(20);
        car.setRange(500);

        GasStation gasStation = new GasStation(400);

        System.out.println("Consumption: " + car.consume());
        System.out.println("Price: " + gasStation.fillTank("Ford", 30));


    }
}
