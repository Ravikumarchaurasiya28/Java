public class Permutation {
    public static void main(String[] args) {
        perm("abc", "");
    }
    public static void perm(String s, String p) {
        if(s.length() == 0) {
            System.err.println(p);
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String news = s.substring(0, i) + s.substring(i + 1);
            perm(news, p + ch);
        }
    }
}