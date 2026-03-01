import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers representing the positions of stalls and a number of cows, determine the largest minimum distance that can be maintained between any two cows when placing them in the stalls.

class Main
{
    
    public static boolean canPlace(int stalls[], int cows, int dist){
        int count = 1;
        int last = stalls[0];
        
        for(int i=0;i<stalls.length;i++){
            if(stalls[i] - last >= dist){
                count++;
                last = stalls[i];
                
                if(count == cows){
                    return true;
                }
            }
        }
        return false;    
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stalls = new int[n];

        int max = 0;
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            stalls[i] = sc.nextInt();              // maximum possible answer
        }

        int cows = sc.nextInt();
        Arrays.sort(stalls);
        
        int left = 1;
        int right = stalls[n-1] - stalls[0];
        int answer = 0;
        
        while( left <= right){
            int mid = left + (right -left)/2;
            
            if( canPlace(stalls, cows, mid) ){
                answer = mid;
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        
        System.out.println(answer);

        sc.close();
        
	}
}
