import java.util.*;

public class O2MaxSubArraySumBrute {

    public static void main(String[] args) {
        // int[] arr = {2, 4, 6, 8, 10};
        int[] arr = {1, -2, 6, -1, 3};

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j<arr.length; j++) {
                int sum = 0;

                for(int k = i; k<=j; k++) {
                    sum+=arr[k];
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Max Subarray sum brute: "+maxSum);
    }
}