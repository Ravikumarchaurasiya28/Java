import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        reverseArray(nums);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
    private static void reverseArray(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}