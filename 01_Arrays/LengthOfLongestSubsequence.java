import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers, find the length of the longest subsequence of consecutive integers. The consecutive numbers can be in any order in the array.

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
            
        HashSet<Integer> set= new HashSet<>();
        
        for(int num:arr){
            set.add(num);
        }
        int maxLength = 0;
        
        for(int num:set){
            
            if(!set.contains(num - 1)){
                
                int current =num;
                int length = 1;
                
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                maxLength = Math.max( maxLength, length);
            }
        }
        
        System.out.println(maxLength);
	}
}
