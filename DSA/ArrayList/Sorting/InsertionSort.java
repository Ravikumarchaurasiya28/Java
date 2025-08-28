import java.util.*;

public class InsertionSort {
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
            int j = i;
            while(j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
    }
}