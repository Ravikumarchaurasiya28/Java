
public class Keypad {
    public static String[] pad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        printCombination("23", 0, "");
    }
    public static void printCombination(String s, int idx, String comb) {
        if(idx == s.length()) {
            System.err.println(comb);
            return;
        }
        char ch = s.charAt(idx);
        String map = pad[ch - '0'];
        for(int i = 0; i < map.length(); i++) printCombination(s, idx + 1, comb + map.charAt(i));
    }
}