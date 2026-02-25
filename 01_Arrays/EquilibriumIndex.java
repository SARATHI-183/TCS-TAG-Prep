import java.util.*;
import java.lang.*;
import java.io.*;

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
