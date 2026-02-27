import java.util.*;
import java.lang.*;
import java.io.*;

// Given two strings, determine if they are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		
	    String s1= sc.nextLine().trim();
	    String s2= sc.nextLine().trim();
	    
	    if( s1.length() != s2.length()){
	        System.out.println(false);
		    return;
	    }
	    
	    Map<Character, Integer> map= new HashMap<>();
	    
	    for(char c:s1.toCharArray()){
	        map.put(c, map.getOrDefault(c ,0)+1);
	    }
	    
	    for(char c:s2.toCharArray()){
	        if(!map.containsKey(c)){
	            System.out.println(false);
		        return;
	        }
	        
	        map.put(c, map.get(c) -1);
	        
	        if(map.get(c) == 0){
	            map.remove(c);
	        }
	    }
	    
	    System.out.println(map.isEmpty());
	}
}
