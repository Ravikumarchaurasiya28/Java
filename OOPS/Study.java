class Pen {
    String color;
    String type;
    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }
    public void printPen() {
        System.out.println("Writing something...");
        System.out.println("Pen Color: " + this.color);
        System.out.println("Pen Type: " + this.type);
    }
}

class Book {
    String name;
    String lang;
    Book(String name, String lang) {
        this.name = name;
        this.lang = lang;
    }
    public void printBook() {
        System.out.println("Printing");
        System.out.println("Book Name: " + this.name);
        System.out.println("Book Language: " + this.lang);
    }
}

class Student {
    String name;
    int age, rollno;
    Student(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    public void printInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollno);
    }
}

public class Study {
    public static void main(String[] args) {
        Book b = new Book("Dhun ke pakke", "Hindi");
        b.printBook();
        Pen p = new Pen("Blue", "Ball");
        p.printPen();
        Student s = new Student("Ravi", 20, 28);
        s.printInfo();
    }
}