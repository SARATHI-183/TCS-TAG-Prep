import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers and a target number, determine if there is a contiguous subarray in the array that sums up to the target number. If such a subarray exists, return "YES"; otherwise, return "NO".

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        
        int a[]= new int [n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target= sc.nextInt();
		
		int left= 0;
		int sum= 0;
		boolean ans= false;
		
		for(int right=0;right<a.length;right++){
		    sum+= a[right];
		    while( sum > target && left <= right){
		        sum-= a[left];
		        left++;
		    }
		    
		    if(sum == target ){
		        ans= true;
		        break;
		    }
		}
		
		if(ans){
		    System.out.println("YES");
		 }
		 else{
		    System.out.println("NO");
		 }
	}
}
