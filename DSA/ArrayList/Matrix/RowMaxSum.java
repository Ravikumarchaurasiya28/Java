import java.util.*;

public class RowMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row & column size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] nums = new int[r][c];
        System.out.println("Enter Array: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) nums[i][j] = sc.nextInt();
        }
        int max = 0, idx = -1;
        for(int i = 0; i < r; i++) {
            int sum = 0;
            for(int j = 0; j < c; j++) sum += nums[i][j];
            if(sum > max) {
                max = sum;
                idx = i;
            }
        }
        System.out.println("Maximum Sum is: " + max + " & Row is: " + idx);
    }
}