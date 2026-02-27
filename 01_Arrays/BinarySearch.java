import java.util.*;
import java.lang.*;
import java.io.*;

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
        int right= n-1;
        int res= -1;
		
		while( left <= right ){
		    int mid = left + (right -left)/2;
		    
		    if(a[mid] == target){
		        res= mid;
		        break;
		    }
		    else if(a[mid] < target){
		        left = mid + 1;
		    }
		    else{
		        right = mid - 1;
		    }
		}
		
        System.out.println(res);
	}
}

