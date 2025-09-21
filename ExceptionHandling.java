public class ExceptionHandling {
    public static void main(String[] args) {
        int m = 5, n = 0;
        try {
            System.out.println(m + " Divided by " + n + " = " + (m / n));
        }
        catch(Exception e) {
            System.out.println("Division is not possible due to:");
            System.out.println(e);
        }
    }
}
