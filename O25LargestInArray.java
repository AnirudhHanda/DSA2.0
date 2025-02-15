import java.util.*;

public class O25LargestInArray {
    public static int largestBrute(int[] arr) {
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    public static int largestOptimal(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 88, 9};

        System.out.println("Largest Brute: "+largestBrute(arr));
        System.out.println("Largest Optimal: "+largestOptimal(arr));
    }
}