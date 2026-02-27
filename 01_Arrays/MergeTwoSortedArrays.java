import java.util.*;
import java.lang.*;
import java.io.*;

// Given two sorted arrays of integers, merge them into a single sorted array.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);

        int n1= sc.nextInt();
        int a[]= new int [n1];
        
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        
        int n2= sc.nextInt();
        int b[]= new int [n2];
        
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        
        int i=0,j=0;
        
        ArrayList<Integer> list= new ArrayList<>();
		
        while( i<n1 && j<n2 ){
            if(a[i] <= b[j]){
                list.add(a[i]);
                i++;
            }
            else{
                list.add(b[j]);
                j++;
            }
        }
        
        while(i<n1){
            list.add(a[i]);
            i++;
        }
        
        while(j<n2){
            list.add(b[j]);
            j++;
        }
		
		for(int num:list){
		    System.out.print(num+" ");
		}
	}
}
