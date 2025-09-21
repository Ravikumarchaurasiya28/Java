import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        int num = (int) n;
        if(n - num > 0.0) System.out.println("Not an Integer");
        else System.out.println("An Integer");
    }
}
