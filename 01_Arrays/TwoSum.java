import java.util.*;
import java.lang.*;
import java.io.*;

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

        int target = sc.nextInt();
        
        HashMap<Integer, Integer> map= new HashMap<>();
        
        for(int i=0;i<n;i++){
            int need = target - arr[i];
            
            if(map.containsKey(need)){
                System.out.println(map.get(need) + " " + i);
                return;
            }
            map.put(arr[i],i);
        }
        sc.close();
	}
}
