import java.util.*;

public class SearchTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                System.out.println("Found at index " + (i + 1));
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Not found");
    }
}