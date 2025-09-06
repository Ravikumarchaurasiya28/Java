import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        subarraySum(nums, k);
    }

    public static void subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0, sum = 0;
        for(int i : nums) {
            sum += i;
            if(map.containsKey(sum - k)) ans += map.get(sum - k);

            if(map.containsKey(sum)) map.put(sum, map.get(sum) + 1);
            else map.put(sum, 1);
        }
        System.out.println(ans);
    }
}