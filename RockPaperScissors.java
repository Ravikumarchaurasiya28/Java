import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        /* Rock -> 0
            Paper -> 1
            Scissoors -> 2
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput) System.out.println("Draw!");
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
        || userInput == 2 && computerInput == 1) System.out.println("You Win!");
        else System.out.println("Computer Win!");
        System.out.println("Your Input: " + userInput);
        System.out.println("Computer Input: " + computerInput);
    }
}