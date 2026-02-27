import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;

        int floor = -1;
        int ceil = -1;
        
        while( left <= right ){
            int mid = left + (right - left)/2;
            
            if(arr[mid] == target){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            else if(arr[mid] < target){
                floor = arr[mid];
                left = mid + 1;
            }
            else{
                ceil = arr[mid];
                right = mid - 1;
            }
        }
                System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);

        sc.close();
	}
}
