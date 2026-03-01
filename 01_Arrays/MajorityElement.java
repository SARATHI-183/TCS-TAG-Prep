import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers, find the majority element. The majority element is the element that appears more than n/2 times in the array. You can assume that the majority element always exists in the array.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int candidate = 0;
        int count = 0;
        
        for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            else if(candidate == num){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(candidate);
	}
}
