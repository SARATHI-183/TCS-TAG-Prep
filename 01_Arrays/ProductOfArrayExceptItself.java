import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers, return an array where each element at index i is the product of all the numbers in the original array except the one at index i. You must solve this problem without using division and in O(n) time complexity.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];
        
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*arr[i-1];
        }
        
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*arr[i+1];
        }
        
        for(int i=0;i<n;i++){
            result[i]= prefix[i]*suffix[i];
        }
        
        for(int num : result)
            System.out.print(num + " ");
	}
}
