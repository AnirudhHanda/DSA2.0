import java.util.*;

public class O22_3TwoSumOptimal {
    public static boolean twoSumOptimal(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i < j) {
            int sum = arr[i] + arr[j];

            if(sum < target) {
                i++;
            } else if(sum > target) {
                j--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 9, 1};

        
        System.out.println("Two Sum Better: ");
        if(twoSumOptimal(arr, 99)) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
        
    }
}
