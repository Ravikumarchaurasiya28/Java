abstract class Animal {
    abstract void walk();
    Animal() {
        System.err.println("You are creating a animal");
    }
    public void eat() {
        System.err.println("Animal is eating grass");
    }
}

class Horse extends Animal {
    public void walk() {
        System.err.println("Walk on 4 legs fastly");
    }
    Horse() {
        System.err.println("Horse is eating");
    }
}

class Cow extends Animal {
    public void walk() {
        System.err.println("Walk on 4 legs slowly");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        Cow c = new Cow();
        c.walk();
    }
}