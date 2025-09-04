import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        reverse(s, s.length() - 1);
    }
    private static void reverse(String s, int idx) {
        if(idx == 0) {
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        reverse(s, idx - 1);
    }
}