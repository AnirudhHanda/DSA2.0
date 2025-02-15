import java.util.*;

public class O22_1TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];

        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 9, 1};

        int[] ans = twoSum(arr, 9);
        System.out.println("Two Sum Brute: ");
        System.out.println(Arrays.toString(ans));

    }
}