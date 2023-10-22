package mk;

import java.util.*;

public class CollectionF {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				Vector<String> v = new Vector<String>();
				mk: while (true) {
					System.out.println("****Vector<String> Objects****");
					System.out.println(
							"1.addElement(E)\n2.removeElement(Obj)\n3.size()\n4.setElementAt(E,int)\n5. removeElementAt(int)\n6.insertElementAt(obj,I)\n7.exit");
					System.out.println("Enter the Choice:");
					switch (new Integer(Integer.parseInt(sc.nextLine()))) {
					case 1:
						System.out.println("Enter the Elements to be Added:");
						v.addElement(new String(sc.nextLine()));
						System.out.println("Element's Added: " + v);
						break;
					case 2:
						if (v.isEmpty()) {
							System.out.println("Vector is Empty...");
						} // if
						else {
							System.out.println("Enter the Element to be Removed:");
							String rem = new String(sc.nextLine());
							if (v.removeElement(rem)) {
								System.out.println("Element Removed...." + rem);
								System.out.println("Remaining Elements: " + v);
							} // if
							else {
								System.out.println("Element not Available...");
							} // end of else
						} // end of else
						break;
					case 3:
						System.out.println(v.size());
						break;
					case 4:
						if (v.isEmpty()) {
							System.out.println("Vector is Empty...");
						} else {
							System.out.println("Enter the Element to be set at:");
							String se = new String(sc.nextLine());
							v.setElementAt(se, 0);
							System.out.println("Element setted...." + se);
							System.out.println("Total Element's: " + v);
						} // end of else
						break;
					case 5:
						if (v.isEmpty()) {
							System.out.println("Vector is Empty...");
						} else {
							v.removeElementAt(5);
							System.out.println("Remaining Element's: " + v);
						} // end of else
						break;
					case 6:
						if (v.isEmpty()) {
							System.out.println("Vector is Empty...");
						} else {
							System.out.println("Enter the Element to be inserft at:");
							String ie = new String(sc.nextLine());
							v.insertElementAt(ie, 0);
							System.out.println("Element Inserted:" + ie);
							System.out.println("Remaining Element's: " + v);
						} // end of else
						break;
					case 7:
						System.out.println("Operations Stopped...");
						break mk;
					default:
						System.out.println("Invalid Choice...");
						break;
					}// end of switch
				} // end of loop
			} // end of try
			catch (Exception ex) {
				ex.printStackTrace();
			} // end of catch
		} // end of try-with-resource
	}// main
}// class