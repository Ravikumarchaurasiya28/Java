class Numbers {
    int x;
    Numbers(int x) {
        this.x = x;
    }
}

public class Swap {
    public static void main(String[] args) {
        int x = 4, y = 3;
        Numbers num1 = new Numbers(x);
        Numbers num2 = new Numbers(y);
        swap(num1, num2);
        System.out.println("X : " + num1.x + " y : " + num2.x);
    }
    private static void swap(Numbers a, Numbers b) {
        int temp = a.x;
        a.x = b.x;
        b.x = temp;
    }
}