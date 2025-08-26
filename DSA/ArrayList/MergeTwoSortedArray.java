import java.util.*;

public class MergeTwoSortedArray {
    static List<Integer> list = new ArrayList<> ();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of both Arrays: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter 1st Sorted Array elements: ");
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for(int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd Sorted Array elements: ");
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        mergeArray(arr1, arr2);
        System.out.println("After Merge Array is: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    private static void mergeArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else if(arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            } else {
                list.add(arr1[i]);
                i++; j++;
            }
        }
        while(i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }
        while(j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }
    }
}