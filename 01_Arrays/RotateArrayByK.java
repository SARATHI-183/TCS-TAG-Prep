import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers and a number k, rotate the array to the right by k steps. For example, if the input array is [1, 2, 3, 4, 5] and k is 2, the output should be [4, 5, 1, 2, 3].

class Main
{
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int k= sc.nextInt();
        k = k%n;
        
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        
        for(int num : arr)
            System.out.print(num + " ");
	}
}
