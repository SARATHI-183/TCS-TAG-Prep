import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);

		String s = sc.nextLine().trim();

		HashSet<Character> set = new HashSet<>();
		
		int left= 0;
		int maxlength= 0;
		
		for(int right=0;right<s.length();right++){
		    while(set.contains(s.charAt(right))){
		        set.remove(s.charAt(left));
		        left++;
		    }
		    set.add(s.charAt(right));
		    maxlength= Math.max( maxlength, right-left+1);
		}
		
		System.out.println(maxlength);
		return;

	}
}
