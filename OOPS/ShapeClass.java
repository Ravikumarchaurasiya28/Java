class Shape {
    public void area() {
        System.out.println("Printing area...");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of triangle: " + (0.5 * l * h));
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.err.println("Area of circle: " + (3.14 * r * r));
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        Triangle t = new Triangle();
        t.area(2, 3);
        Circle c = new Circle();
        c.area(2);
    }
}