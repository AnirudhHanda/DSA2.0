import java.util.*;

public class O27CheckIfSortedRotated {
    public static boolean checkSortedRotated(int[] nums) {

        int n = nums.length; 
        int count = 0;

        if(nums[0] < nums[n-1]) count++;
        for(int i = 0; i<n-1; i++) {
            if(nums[i] > nums[i+1]) {
                count++;
            }
            if(count > 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};

        System.out.println("Sorted Rotated: "+checkSortedRotated(arr));
    }
}