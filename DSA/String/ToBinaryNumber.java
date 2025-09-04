import java.util.*;

public class ToBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        binaryNumber(n);
    }
    private static void binaryNumber(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        sb.reverse();
        System.out.println("Binary Representation: " + sb);
    }
}