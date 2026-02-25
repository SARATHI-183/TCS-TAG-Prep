import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		String str= sc.nextLine().trim();
		
		if(str ==null || str.length() == 0){    
		    System.out.println(-1);
            return;
		}
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		for(char c:str.toCharArray()){
		    map.put(c, map.getOrDefault(c,0)+1);
		}
        
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println(str.charAt(i));
                return ;
            }
        }
        
        System.out.println(-1);

	}
}
