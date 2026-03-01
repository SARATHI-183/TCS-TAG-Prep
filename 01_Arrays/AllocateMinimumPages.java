import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    
    public static boolean canAllocate(int books[], int students, int maxPages){
        int studentCount =1;
        int currentPage =0;
        
        for(int i=0;i<books.length;i++){
            if(currentPage+books[i] > maxPages){
                studentCount++;
                currentPage= books[i];
                if(studentCount > students){
                    return false;
                }
            }
            else{
                currentPage+= books[i];
            }
        }
        return true;    
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] books = new int[n];

        int max = 0;
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            books[i] = sc.nextInt();
            max = Math.max(max, books[i]); // minimum possible answer
            sum += books[i];               // maximum possible answer
        }

        int students = sc.nextInt();
        
        int left = max;
        int right = sum;
        int answer = sum;
        
        while( left <= right){
            int mid = left + (right -left)/2;
            
            if( canAllocate(books, students, mid) ){
                answer = mid;
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        
        System.out.println(answer);

        sc.close();
        
	}
}
