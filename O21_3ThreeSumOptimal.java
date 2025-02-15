import java.util.*;

public class O21_3ThreeSumOptimal {
    public static List<List<Integer>> uniqueTriplets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0; i<n; i++) {
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int j = i+1;
            int k = n-1;

            while(j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else { // triplet found
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);

                    ans.add(temp);
                    j++;
                    k--;

                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = {-1, 0, 1, 2, -1, -4};
        int[] arr = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};

        System.out.println("Unique Triplets Optimal (Two Pointers): ");
        List<List<Integer>> ans = uniqueTriplets(arr);

        System.out.println(ans);
    }
}