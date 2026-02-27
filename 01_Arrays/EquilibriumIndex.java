import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers, find the equilibrium index of the array. The equilibrium index is the index where the sum of elements to the left of the index is equal to the sum of elements to the right of the index. If there are multiple equilibrium indices, return the smallest one. If there is no equilibrium index, return -1.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int a[]= new int [n];
		int totalSum=0;
		
		for(int i=0;i<n;i++){
		    a[i]= sc.nextInt();
		    totalSum+=a[i];
		}
		
		int leftSum=0;
		
		for(int i=0;i<n;i++){
		    int rightSum= totalSum - leftSum - a[i];
		    if( leftSum == rightSum ){
		        System.out.println(i);
		        return;
		    }
		    leftSum+=a[i];
		    
		}
		System.out.println(-1);
	}
}
