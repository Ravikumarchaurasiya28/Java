import java.util.Scanner;

public class BuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Square : " + Math.pow (n, 2));
        System.out.println("Cube : " + Math.pow (n, 3));
        System.out.println("Square root : " + Math.sqrt(n));
        System.out.println("Ceil value: " + Math.ceil(1.45));
        System.out.println("Floor value: " + Math.floor(1.45));
    }
}