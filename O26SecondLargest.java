import java.util.*;

public class O26SecondLargest {

    public static int secondLargestBrute(int[] arr) {
        Arrays.sort(arr);

        for(int i = arr.length-2; i>=0; i--) {
            if(arr[i] != arr[i+1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static int secondLargestOptimal(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if(arr[i] > sLargest && arr[i] < largest) {
                sLargest = arr[i];
            }
        }

        return sLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Second largest Brute: "+secondLargestBrute(arr));
        System.out.println("Second Largest Optimal: "+secondLargestOptimal(arr));
    }
}