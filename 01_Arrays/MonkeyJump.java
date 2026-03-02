import java.util.*;
import java.lang.*;
import java.io.*;

// A monkey wants to climb to the top of a tree that is H meters tall. The monkey can climb U meters in one minute, but then it slips down D meters immediately after climbing. The monkey continues this pattern of climbing and slipping until it reaches the top of the tree. Determine how many minutes it will take for the monkey to reach the top of the tree.

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        long H = sc.nextLong();
        long U = sc.nextLong();
        long D = sc.nextLong();
        
        if (U >= H) {
            System.out.println(1);
            return;
        }
        
        if (U <= D) {
            System.out.println(-1);
            return;
        }
        
        long remainingHeight = H - U;
        long effectiveClimb = U - D;
        
        long minutes = 1 + (remainingHeight + effectiveClimb - 1)/ effectiveClimb;
        System.out.println(minutes);

	}
}
