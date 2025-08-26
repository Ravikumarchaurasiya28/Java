import java.util.*;

public class SelectionSort {
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
        for(int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE, idx = -1;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    idx = j;
                }
            }
            swap(nums, i, idx);
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}