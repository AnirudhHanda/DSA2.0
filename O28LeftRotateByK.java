import java.util.*;

public class O28LeftRotateByK {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // k++; if they count from 0
        // bruteforce
        int temp[] = new int[k];
        // 1. put first k in temp
        for(int i = 0; i<k; i++) {
            temp[i] = nums[i];
        }

        // 2. shift remainig to left
        for(int i = k; i<n; i++) {
            nums[i-k] = nums[i];
        }

        // 3. put back temp into last of nums
        for(int i = n-k; i<n; i++) {
            nums[i] = temp[i-(n-k)]; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}