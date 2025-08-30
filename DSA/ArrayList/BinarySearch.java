import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Sorted Array: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter element to be search: ");
        int target = sc.nextInt();
        binarySearch(nums, target);
    }
    private static void binarySearch(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int mid = (i + j) / 2;
            if(nums[mid] == target) {
                System.out.println("Exist");
                return;
            }
            else if(nums[mid] < target) i = mid + 1;
            else j = mid - 1;
        }
        System.out.println("Not Exist");
    }
}