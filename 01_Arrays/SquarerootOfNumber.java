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

        int left = 0;
        int right = n;
        int res = 0;
        
        while(left <= right){
            int mid = left + (right -left)/2;
            
            long square = (long) mid*mid;
            
            if( square == n){
                res= mid;
                break;
            }
            else if( square < n){
                res= mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            
        }
        
        System.out.println(res);
        sc.close();
	}
}
