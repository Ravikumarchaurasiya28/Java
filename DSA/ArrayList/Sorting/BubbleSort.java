import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array to be sort: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Sort(nums);
        System.out.println("After sorting Array: ");
        for(int i = 0; i < n; i++) System.out.print(nums[i] + " ");
    }
    private static void Sort(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] > nums[i]) swap(nums, i, j);
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}