import java.util.*;

public class SumOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                sum += Integer.parseInt(str);
            }
        }
        System.out.print("Sum : " + sum);
    }
}