import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        if(isPalindrome(s)) System.out.println(s + " is a Palindrome String.");
        else System.out.println(s + " is not a Palindrome String.");
    }
    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}