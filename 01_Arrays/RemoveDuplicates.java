import java.util.*;

// Given a sorted array of integers, remove the duplicates in-place such that each element appears only once and return the new length of the array.

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(arr);

        for(int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) return 0;

        int j = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }
}