import java.util.*;

public class O21_1ThreeSumBrute {
    public static List<List<Integer>> uniqueTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                for(int k = j+1; k<n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }

        for(List<Integer> al : set) {
            ans.add(al); 
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = uniqueTriplets(arr);

        System.out.println(ans);
    }
}