package mk;

import java.util.*;

public class Collection_Stack {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				Stack<String> s = new Stack<String>();
				while (true) {
					System.out.println("===Choice===");
					System.out.println("1.push(E)\n2.pop\n3.peek\n4.search(obj)\n5.exit");
					System.out.println("===Enter the choice===");
					switch (new Integer(Integer.parseInt(sc.nextLine()))) {
					case 1:
						System.out.println("Enter the Element:");
						s.push(new String(sc.nextLine()));
						System.out.println(s.toString());
						break;
					case 2:
						if (s.isEmpty()) {
							System.out.println("Stack is Empty...");
						} // if
						else {
							System.out.println("Element Popped: " + s.pop());
							System.out.println("Remaining Elements: " + s.toString());
						} // else
						break;
					case 3:
						if (s.isEmpty()) {
							System.out.println("Stack is Empty...");
						} // if
						else {
							System.out.println("Peek Element: " + s.peek());
							System.out.println("Elements: " + s.toString());
						} // else
						break;
					case 4:
						if (s.isEmpty()) {
							System.out.println("Stack is Empty...");
						} // if
						else {
							System.out.println("Enter the Element to be searched :");
							String ele = new String(sc.nextLine());
							int i = s.search(ele);
							if (i > 0) {
								System.out.println("The Element found at position :" + i);
							} // if
							else {
								System.out.println("Element Not Found...");
							} // else
						} // else
						break;
					case 5:
						System.out.println("Operations Stopped...");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid choice....");
						break;
					}// end of switch
				} // end of loop
			} // end of try
			catch (Exception ex) {
				System.out.println("Eneter Integer Values Only...");
				ex.getMessage();
			} // catch
		} // end of try-with-resource
	}// main
}// class