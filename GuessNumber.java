import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int guessNo = random.nextInt(1000);
        int n = -1, cnt = 0;
        while(n != guessNo) {
            System.out.print("Guess a number from 0 to 1000 : ");
            n = sc.nextInt();
            cnt++;
            if(n == guessNo) {
                System.out.println("You Got It!");
                break;
            }
            else if(n > guessNo) System.out.println("Think Small Number!");
            else System.out.println("Think Big Number!");
        }
        System.out.println("You Tried " + cnt + " times");
    }
}
