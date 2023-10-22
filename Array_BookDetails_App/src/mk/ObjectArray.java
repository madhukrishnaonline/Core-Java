package mk;

import java.util.*;
import test.*;

public class ObjectArray {
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try (sc;) 
		{
			try 
			{
				Object o[] = new Object[6];
				o[0] = new Integer(123);
				o[1] = new Float(123.3f);
				o[2] = new String("madhu");
				o[3] = new BookDetails("Pushpa", "maithri", "sukumar", 1000);
				o[4] = new Boolean(true);
				o[5] = new Long(912149357);
				// o[6] = new Double(8888.5);
				// o[7] = new Integer(555);
				Spliterator<Object> sp = Arrays.spliterator(o);
				sp.forEachRemaining((f) -> {
					System.out.println(f.toString());
				});
			} //try
			catch (Exception ex) {
				System.out.println("Enter Objects in Specified Size only...");
				ex.getMessage();
			}//catch
		} // end of try-with-resource
	}//main
}// class