import java.util.*;
import java.lang.*;
import java.io.*;

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
        
        int left= 0;
        int right= n - 1;
        int res = -1;
        
        while( left <= right ){
            int mid = left + (right - left )/2;
            
            if( a[mid] == target ){
                res = mid;
                break;
            }
            
            if( a[left] <= a[mid]){
                if( target >= a[left] && target < a[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if( target >= a[mid] && target < a[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        System.out.println(res);
        sc.close();
	}
}
