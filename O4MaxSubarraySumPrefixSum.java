import java.util.*;

public class O4MaxSubarraySumPrefixSum {
    public static int maxSubArraySumPrefix(int[] arr) {
        int[] prefix = new int[arr.length];

        int maxSum = 0;

        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j<arr.length; j++) {
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};

        System.out.println("Max Subarray sum: "+maxSubArraySumPrefix(arr));
    }
}