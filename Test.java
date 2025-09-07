public class Test {
    public static int countBinaryPalindromes(long n) {
        int cnt = 0;
        long num = n;
        for(long i = 0; i <= num; i++) {
            if(isPalindrome(i)) cnt++;
        }
        return cnt;
    }
    public static boolean isPalindrome(long n) {
        if(n == 0) return true;
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        int i = 0, j = sb.length() - 1;
        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(countBinaryPalindromes(2097151));
    }
}