import java.util.*;

public class Main
{
	
	public static int[] answer(int n, int[] arr)
	{
		// Write you code for each test case here
		    
		    
		    return arr;
	}
	
	// dont modify this code unless you know what you are doing
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt(); // this is the length of the input array
		    int[] arr = new int[n]; // this is the array you need to work on
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
		    int[] ans = answer(n, arr);
		    for(int i = 0; i < n; i++)
		    {
		    	System.out.print(ans[i] + " ");
		    }
		    System.out.println();
		}
		
	}
}
