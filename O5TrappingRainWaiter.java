import java.util.*;

public class O5TrappingRainWaiter {
    public static int waterTrapped(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        int totalWaterTrapped = 0;

        // calculating leftMax
        leftMax[0] = height[0];
        for(int i = 1; i<height.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // calculating rightMax
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }


        // calculating total water trapped
        for(int i = 0; i<height.length; i++) {
            int waterTrapped = (Math.min(leftMax[i], rightMax[i]) - height[i]) * 1;

            totalWaterTrapped+=waterTrapped;
        }

        return totalWaterTrapped;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Max Water Trapped: "+waterTrapped(height));
    }
}