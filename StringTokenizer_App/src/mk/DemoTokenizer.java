package mk;
import java.util.*;
public class DemoTokenizer {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		System.out.println("Enter the delimiter(break specification):");
		String dm = s.nextLine();
		StringTokenizer ob = new StringTokenizer(str, dm);
		System.out.println("count of tokens:"+ob.countTokens());
		System.out.println("===Display tokens===");
		while(ob.hasMoreTokens())
		{
			String tk = ob.nextToken();
			System.out.println("Token :"+tk.toString());
			System.out.println("count of Tokens:"+ob.countTokens());
		}//end of loop
		s.close();
	}//main
}//class