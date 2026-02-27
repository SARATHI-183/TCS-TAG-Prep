import java.util.*;
import java.lang.*;
import java.io.*;

// Given a sorted 2D matrix of integers, where each row is sorted in ascending order and the first integer of each row is greater than the last integer of the previous row, find if a given target number exists in the matrix. Return true if it exists, otherwise return false.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        
        int left = 0;
        int right = n*m - 1;
        boolean found = false;
        
        while( left <= right ){
            int mid = left + (right - left)/2;
            int row = mid / m; 
            int col = mid % m;
            
            if(matrix[row][col] == target){
                found = true;
                break;
            }
            else if(matrix[row][col] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println(found);

        sc.close();
	}
}
