import java.util.*;
import java.lang.*;
import java.io.*;


// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] piles = new int[n];

        int max = 0;

        for(int i = 0; i < n; i++){
            piles[i] = sc.nextInt();
            max = Math.max(max, piles[i]);
        }
        
        int h = sc.nextInt();
        int left = 1;
        int right = max;
        int ans = max;
        
        while( left <= right ){
            int mid = left + (right - left)/2;
            
            int hours =0;
            
            for(int pile:piles){
                hours+=(pile + mid -1)/mid;
            }
            
            if(hours <= h){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        System.out.println(ans);

        sc.close();
	}
}
