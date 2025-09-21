import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of five subjects: ");
        int[] marks = new int[5];
        for(int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        double sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        System.out.println("Sum is: " + sum + " & Percentage is: " + sum / 5);
    }
}
