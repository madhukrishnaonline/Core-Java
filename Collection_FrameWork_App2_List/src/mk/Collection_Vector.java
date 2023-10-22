package mk;

import java.util.*;

public class Collection_Vector {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				Vector<Integer> ob = new Vector<Integer>();
				int i = 65;
				while (i <= 90) {
					ob.addElement(new Integer(i));
					i++;
				} // end of loop
				System.out.println("The Elements :" + ob.toString());
				System.out.println("The Size :" + ob.size());
				System.out.println("Element AT:" + ob.elementAt(25));
				System.out.println("First Element :" + ob.firstElement());
				System.out.println("Last Element:" + ob.lastElement());
				ob.setElementAt(68, 4);
				System.out.println("Set Element AT:" + ob.toString());
				System.out.println("The Size :" + ob.size());
				ob.removeElement(new Integer(68));
				System.out.println("The Elements :" + ob.toString());
				System.out.println("The Size :" + ob.size());
				ob.insertElementAt(69, 4);
				System.out.println("The Elements :" + ob.toString());
				System.out.println("The Size :" + ob.size());
				// ob.indexOf(88);
				System.out.println("Index of 88:" + ob.indexOf(88));
				ob.removeAllElements();
				System.out.println("The Elements :" + ob.toString());
				System.out.println("The Size :" + ob.size());
			} // end of try
			catch (Exception e) {
				e.printStackTrace();
			} // catch
		} // end of try
	}// main
}// class