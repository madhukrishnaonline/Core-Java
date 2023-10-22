package mk;
import java.util.*;
public class CursorStatements2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int i =65;
		while(i<=90)
		{
			v.add(new Integer(i));
			i++;
		}//end of loop
		System.out.println("===Listiterator<E>===");
		System.out.println("==Forward Direction==");
		ListIterator<Integer> li = v.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}//end of loop
		System.out.println("\n==BackWard Direction==");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}//end of loop
		System.out.println("\n===Enumeration<E>===");
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}//while
	}//main
}//class