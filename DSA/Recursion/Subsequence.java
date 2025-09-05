public class Subsequence {
    public static void main(String[] args) {
        subsequence("abc", 0, "");
    }
    public static void subsequence(String s, int idx, String newS) {
        if(idx == s.length()) {
            System.err.println(newS);
            return;
        }
        char ch = s.charAt(idx);
        subsequence(s, idx + 1, newS + ch);
        subsequence(s, idx + 1, newS);
    }
}