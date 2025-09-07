public class NcrAndNpr {
    public static void main(String[] args) {
        int n = 4, r = 3;
        System.out.println("NCR: " + nCr(n, r) + " & NPR : " + nPr(n, r));
    }
    private static int factoril(int n) {
        int val = 1;
        for(int i = 1; i <= n; i++) val *= i;
        return val;
    }
    private static int nCr(int n, int r) {
        int factn = factoril(n);
        int factr = factoril(r);
        int factnr = factoril(n - r);
        return factn / (factr * factnr);
    }
    private static int nPr(int n, int r) {
        int factn = factoril(n);
        int factnr = factoril(n - r);
        return factn / factnr; 
    }
}