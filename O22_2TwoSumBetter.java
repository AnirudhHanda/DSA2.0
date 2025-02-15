import java.util.*;

public class O22_2TwoSumBetter {
    // Better Hashing
    public static int[] twoSumBetter(int[] arr, int target) {
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++) {
            int second = target - arr[i];

            if(map.containsKey(second)) {
                ans[0] = map.get(second);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 9, 1};

        int[] ans = twoSumBetter(arr, 9);
        System.out.println("Two Sum Better: ");
        System.out.println(Arrays.toString(ans));
        
    }
}