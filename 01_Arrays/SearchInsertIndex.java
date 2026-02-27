import java.util.*;
import java.lang.*;
import java.io.*;

// Given a sorted array of integers and a target number, find the index where the target number would be inserted in order to maintain the sorted order of the array. If the target number is already present in the array, return its index.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        
        int left= 0;
        int right= n-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(a[mid] == target){
                System.out.println(mid);
                sc.close();
                return;
            }
            else if(a[mid] < target){
                left= mid +1;
            }
            else{
                right= mid -1;
            }
        }
        System.out.println(left);
        sc.close();
	}
}
