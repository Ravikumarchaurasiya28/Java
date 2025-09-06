import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both arrays: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        System.out.println("Enter 1st array elements: ");
        for(int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd array element: ");
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        intersection(nums1, nums2);
    }

    public static void intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<> ();
        for(int i : nums1) set.add(i);
        for(int i : nums2) {
            if(set.contains(i)) System.out.print(i + " ");
        }
    }
}