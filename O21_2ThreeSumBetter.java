import java.util.*;

public class O21_2ThreeSumBetter {

    public static List<List<Integer>> uniqueTriplets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i<n; i++) {
            HashSet<Integer> st = new HashSet<>();

            for(int j = i+1; j<n; j++) {
                int third = -(nums[i] + nums[j]);

                if(st.contains(third)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    Collections.sort(temp);
                    set.add(temp);
                }
                st.add(nums[j]);
            }

        }

        for(List<Integer> al : set) {
            ans.add(al);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println("Unique Triplets Better (Hashing): ");
        List<List<Integer>> ans = uniqueTriplets(arr);

        System.out.println(ans);
    }
}