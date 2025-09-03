import java.util.*;

public class Search {
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
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(nums[i][j] == target) {
                    System.out.println("Found");
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) System.out.println("Not found");
    }
}