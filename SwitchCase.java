import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add\nSubtract\nMultiply\nDivide");
        System.out.print("Enter your choice: ");
        String choice = sc.next();
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        switch (choice) {
            case "+" -> System.out.println(a + " + " + b + " = " + (a + b));
            case "-" -> System.out.println(a + " - " + b + " = " + (a - b));
            case "*" -> System.out.println(a + " * " + b + " = " + (a * b));
            case "/" -> System.out.println(a + " / " + b + " = " + (a / b));
            default -> System.out.println("Entered wrong key");
        }
    }
}
