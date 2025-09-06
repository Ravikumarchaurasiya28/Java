import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        majorityElement(nums);
    }
    public static void majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<> ();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > nums.length / 3) System.out.print(key + " ");
        }
    }
}