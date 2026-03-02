import java.util.*;

// Given an array of integers, move all the zeros to the end of the array while maintaining the relative order of the non-zero elements.

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        moveZeroes(arr);
        
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void moveZeroes(int[] arr) {
        int insertPos = 0;
        
        // Move all non-zero elements forward
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        
        // Fill remaining with zeros
        while(insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }
}