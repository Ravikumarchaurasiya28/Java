import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotateArray(nums, k);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
    private static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        int[] demo = new int[n];
        k %= n;
        for(int i = 0; i < n; i++) {
            demo[i] = nums[(i + k) % n]; 
        }
        for(int i = 0; i < n; i++) {
            nums[i] = demo[i];
        }
    }
}