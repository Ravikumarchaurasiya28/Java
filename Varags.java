import java.util.Scanner;

public class Varags {
    private static int sum(int ...arr) {
        int sum = 0;
        for(int a : arr) sum += a;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
    }
}
