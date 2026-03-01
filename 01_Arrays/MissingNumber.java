// import java.util.*;
// import java.lang.*;
// import java.io.*;

// // Given an array of integers from 0 to n, where one number is missing, find the missing number. For example, if the input array is [1, 2, 4, 5], the output should be 3.

// class Main
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         int actualSum = 0;

//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//             actualSum+= arr[i];
//         }
        
//         int exceptedSum = n*(n+1)/2;
        
//         int missingNumber = exceptedSum - actualSum;
        
//         System.out.println(missingNumber);
// 	}
// }


import java.util.*;
import java.lang.*;
import java.io.*;

// Given an array of integers from 0 to n-1, where one number is missing, find the missing number. For example, if the input array is [1, 2, 4, 5], the output should be 3.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n-1];
        
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
    
        int xor = 0;
        for(int i=1;i<=n;i++){
            xor ^= i;
        }
        
        for(int num:arr){
            xor ^= num;
        }
        
        System.out.println(xor);
	}
}
