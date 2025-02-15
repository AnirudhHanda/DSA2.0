import java.util.*;

public class O7ContainsDuplicates {
    public static boolean containsDuplicatesBrute(int[] arr) {
        for(int i = 0; i<arr.length-1; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicatesOptimal(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5};

        System.out.println((containsDuplicatesBrute(arr))? "Brute: True": "Brute: False");
        System.out.println((containsDuplicatesBrute(arr))? "Optimal: True": "Optimal: False");
    }
}