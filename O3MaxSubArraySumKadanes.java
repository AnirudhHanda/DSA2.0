import java.util.*;

public class O3MaxSubArraySumKadanes {

    public static void main(String[] args) {
        // int[] arr = {-2, -4, -6, -8, -10};
        int[] arr = {1, -2, 6, -1, 3};

        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        boolean allNeg = true;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] >= 0) {
                allNeg = false;
            }
            curr += arr[i];

            if(curr < 0) {
                curr = 0;
            }

            maxSum = Math.max(maxSum, curr);
        }

        if(allNeg) {
            maxSum = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length; i++) {
                maxSum = Math.max(maxSum, arr[i]);
            }
        }


        System.out.println("Max Subarray sum kadane: "+maxSum);
    }
}