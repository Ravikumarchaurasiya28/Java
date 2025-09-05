interface Vehicle {
    int gear = 5;
    public void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.err.println("Running on 4th gear");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}