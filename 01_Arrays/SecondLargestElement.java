import java.util.Scanner;

// Given an array of integers, find the second largest element in the array. If there is no second largest element (i.e., all elements are the same), return -1.

public class SecondLargestElement {
    	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int [n];
	    int first = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){
		    a[i]= sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
		    if( a[i] > first ){
		        second = first;
		        first = a[i];
		    }
		    else if( a[i] > second && a[i]!= first){
		        second = a[i];
		    }
		}
	    
		if(second == Integer.MIN_VALUE){
		    System.out.println(-1);
		}
		else{
		    System.out.println(second);
		}
		
	}
}
