import java.util.*;

public class Main
{
	
	public static String answer(int n, String s)
	{
		// Write you code for each test case here
		    
		    
		    return s;
	}
	
	// dont modify this code unless you know what you are doing
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(); // this is the length of the input string
		    String s = sc.next(); // this is the string you need to work on
		    System.out.println(answer(n, s));
		}
		
	}
}