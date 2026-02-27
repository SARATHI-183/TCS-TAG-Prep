import java.util.*;
import java.lang.*;
import java.io.*;

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
