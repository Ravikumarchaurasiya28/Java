import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isAnagram(s1, s2)) System.out.println("An Anagram");
        else System.out.println("Not an Anagram");
    }
    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0; i < s1.length(); i++) {
            if(ch1[i] != ch2[i]) return false;
        }
        return true;
    }
}