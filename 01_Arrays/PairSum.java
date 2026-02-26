import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int [n];
		int left = 0;
		int right = a.length -1;
		int count = 0;
		
		for(int i=0;i<n;i++){
		    a[i]= sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int target = sc.nextInt();
		
		while( left < right ){
		    int sum = a[left] + a[right];
		    
		    if( sum == target){
		        count++;
		        left++;
		        right--;
		    }
		    else if( sum < target ){
		        left++;
		    }
		    else{
		        right--;
		    }
		    
		}
		System.out.println(count);
	}
}
