import java.util.*;
import java.lang.*;
import java.io.*;
class Chef1
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int sum=x+y;
    		// write your code here
    		if(sum>6){
    		    System.out.println("YES");
    		}else{
    		    System.out.println("NO");
    		}
		}
		
	}
}
