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
        
        int[] a =new int[n];
        
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        int left = 0;
        int right = n -1;
        
        while(left < right){
            int mid = left + (right - left)/2;

            if( a[mid] > a[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
            
        }
        
        System.out.println(a[left]);
        sc.close();
	}
}
