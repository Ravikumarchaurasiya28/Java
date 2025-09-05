class Student {
    String name;
    int age, rollno;
    public void printInfo(String name, int age, int rollno) {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollno);
    }
    public void printInfo(String name, int age) {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public void printInfo(String name) {
        System.out.println("Student Name: " + this.name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 20;
        s.name = "Ravi";
        s.rollno = 28;
        s.printInfo(s.name);
        s.printInfo(s.name, s.age);
        s.printInfo(s.name, s.age, s.rollno);
    }
}