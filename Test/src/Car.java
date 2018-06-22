abstract class Vehicle {
    public int speed() {
        return 0;
    }
}
class Car extends Vehicle {
    public int speed() {
        return 100;
    }
}

class RaceCar extends Car{
    public int speed() {
        return 150;
    }
}

class Main {
    public static void main(String[] args) {
        RaceCar raceCar = new RaceCar();
        Car car = new RaceCar();
        Vehicle vehicle = new RaceCar();
        System.out.println(raceCar.speed() + " " + car.speed() + " " + vehicle.speed());
    }
}


