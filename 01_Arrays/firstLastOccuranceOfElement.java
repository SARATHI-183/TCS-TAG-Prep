import java.util.*;
import java.lang.*;
import java.io.*;

// Given a sorted array of integers, find the first and last occurrence of a given target number in the array. If the target number is not present in the array, return -1 for both occurrences.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();

        // input array
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // target element
        int target = sc.nextInt();
        
        int first = findFirst(a, target);
        int last = findLast(a, target);
        
        System.out.println(first+" "+last);
        sc.close();
	}
        
    static int findFirst( int a[], int target){
        int left= 0;
        int right= a.length - 1;
        int res = -1;
        
        while( left <= right ){
            int mid = left + (right - left )/2;
            
            if( a[mid] == target ){
                res = mid;
                right = mid - 1;
            }
            
            else if( a[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return res;
    }
        
    static int findLast(int a[], int target){
        int left= 0;
        int right= a.length - 1;
        int res = -1;
        
        while( left <= right ){
            int mid = left + (right - left )/2;
            
            if( a[mid] == target ){
                res = mid;
                left = mid + 1;
            }
            
            else if( a[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return res;
    }
}
