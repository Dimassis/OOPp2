public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        Car car2 = new Car(5);

        Truck truck = new Truck("Scania", 6);
        Truck truck2 = new Truck("Volvo",8);

        Bicycle bicycle = new Bicycle("GT", 2);
        Bicycle bicycle2 = new Bicycle(4);

        ServiceStation station = new ServiceStation();
        station.serviceCar(car2);


    }
}