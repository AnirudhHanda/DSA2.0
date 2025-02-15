import java.util.*;

public class O23ModifiedBinarySearch {

    public static int modBinSearch(int[] arr, int tar) {
        int si = 0; 
        int ei = arr.length - 1;

        while(si <= ei) {
            int mid = si + (ei - si)/2;

            if(arr[mid] == tar) {
                return mid;
            } 

            // Case 1: on line 1
            if(arr[si] < arr[mid]) {
                // case a : left
                if(arr[si] >= tar && tar <= arr[mid]) {
                    si = mid - 1;
                } else {    // case b : on right
                    ei = mid + 1;
                }
            } else {
                if(arr[mid] <= tar && tar <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        // logic simple hai line 1 and line2 vala
        int tar = 1;

        System.out.println("Found at index: "+modBinSearch(arr, tar));
    }
}