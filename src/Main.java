public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("car1",4);
        Car car2 = new Car("car2",4);

        Vehicle truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);


        Vehicle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        station.check((Car) car);
        station.check(car2);
        station.check((Bicycle) bicycle);
        station.check(bicycle2);
        station.check((Truck) truck);

        station.check(truck2);
    }
}