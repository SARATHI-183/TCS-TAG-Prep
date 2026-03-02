import java.util.*;

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        for(int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if(height == null || height.length == 0)
            return 0;

        int i = 0;
        int j = height.length - 1;

        int left_max = height[0];
        int right_max = height[j];

        int sum = 0;

        while(i < j) {
            if(left_max <= right_max) {
                sum += (left_max - height[i]);
                i++;
                left_max = Math.max(left_max, height[i]);
            } else {
                sum += (right_max - height[j]);
                j--;
                right_max = Math.max(right_max, height[j]);
            }
        }

        return sum;
    }
}