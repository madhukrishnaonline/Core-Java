package mk;

import java.util.*;

public class CollectionList_E {
	@SuppressWarnings({ "removal", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s = null;
		// List<Integer> ob = null;
		try (sc;) {
			try {
				List<Integer> ob = null;
				while (true) {
					System.out.println("***Implementations On List<E> Operations***");
					System.out.println("1.ArrayList\n2.LinkedList\n3.Vector\n4.exit");
					System.out.println("Select the Option:");
					Integer i = new Integer(sc.nextInt());
					if (i < 0) {
						InputMismatchException ime = new InputMismatchException("Invalid Value....");
						throw ime;
					} // if
					switch (i) {
					case 1:
						ob = new ArrayList();
						System.out.println("Operations on ArrayList<E>");
						break;
					case 2:
						ob = new LinkedList();
						System.out.println("Operations on LinkedList<E>");
						break;
					case 3:
						ob = new Vector();
						System.out.println("Operations on Vector<E>");
						break;
					case 4:
						System.out.println("Set Operations Stopped...");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Option...");
						continue;
					}// end of switch
					mk: while (true) {
						System.out.println("====Choice====");
						System.out.println(
								"1.add\n2.CheckElements\n3.remove\n4.add(index,E)\n5.remove(index,E)\n6.set(index,E)\n7.get(index)\n8.exit");
						System.out.println("Select the Choice:");
						switch (sc.nextInt()) {
						case 1:
							System.out.println("Enter the Element to be Added:");
							ob.add(new Integer(sc.nextInt()));
							System.out.println("The Elements:" + ob.toString());
							break;
						case 2:
							System.out.println("Enter the Element to be search:");
							Integer n = new Integer(sc.nextInt());
							if (ob.contains(n)) {
								System.out.println("The Element Available:" + n.toString());
								System.out.println("Total Elements :" + ob.toString());
							} // if
							else {
								System.out.println("No Elements found..." + ob);
							} // else
							break;
						case 3:
							if (ob.isEmpty()) {
								System.out.println("No Elements Available...");
							} // end of if
							else {
								System.out.println("Enter the Element to be Remove:");
								Integer ele = new Integer(sc.nextInt());
								if (ob.remove(ele)) {
									System.out.println("Elements Removed :" + ele);
									System.out.println("Remaining Elements:" + ob.toString());
								} // end of if
								else {
									System.out.println("Element not Available...");
								} // end of else
							} // end of else
							break;
						case 4:
							if (ob.isEmpty()) {
								System.out.println("Index is empty...");
							} // if
							else {
								System.out.println("Enter the index :");
								Integer index1 = new Integer(sc.nextInt());
								if (index1 >= 0 && index1 < ob.size()) {
									System.out.println("Enter the Element to be Add to Index Value:");
									Integer ele = new Integer(sc.nextInt());
									ob.add(index1, ele);
									System.out.println("The element " + ele + " added");
									System.out.println("The Elements :" + ob.toString());
								} // if
								else {
									System.out.println("Invalid Index value...");
								} // else
							} // else
							break;
						case 5:
							if (ob.isEmpty()) {
								System.out.println("Index is empty...");
							} // if
							else {
								System.out.println("Enter the index :");
								Integer index2 = new Integer(sc.nextInt());
								if (index2 >= 0 && index2 < ob.size()) {
									System.out.println("Enter the Element to be remove from Index Value:");
									Integer ele = new Integer(sc.nextInt());
									ob.remove(ele);
									System.out.println("The element " + ele + " removed");
									System.out.println("The Elements :" + ob.toString());
								} // if
								else {
									System.out.println("Invalid Index value...");
								} // else
							} // else
							break;
						case 6:
							if (ob.isEmpty()) {
								System.out.println("Index is empty...");
							} // if
							else {
								System.out.println("Enter the index :");
								Integer index3 = new Integer(sc.nextInt());
								if (index3 >= 0 && index3 < ob.size()) {
									System.out.println("Enter the Element to be Setted:");
									Integer ele = new Integer(sc.nextInt());
									ob.set(index3, ele);
									System.out.println("The element " + ele + " setted");
									System.out.println("The Elements :" + ob.toString());
								} // end of if
								else {
									System.out.println("Invalid Index value...");
								} // else
							} // else
							break;
						case 7:
							if (ob.isEmpty()) {
								System.out.println("Index is empty...");
							} // if
							else {
								System.out.println("Enter the index :");
								Integer index4 = new Integer(sc.nextInt());
								if (index4 >= 0 && index4 < ob.size()) {
									System.out.println("Enter the Element to be get:");
									Integer ele = new Integer(sc.nextInt());
									ele = ob.get(index4);
									System.out.println("The element " + ele + " got");
									System.out.println("The Elements :" + ob.toString());
								} // end of if
								else {
									System.out.println("Invalid Index value...");
								} // else
							} // else
							break;
						case 8:
							System.out.println("Operation Stopped ...");
							break mk;
						default:
							System.out.println("Invalid choice...");
							break mk;
						}// end of switch
					} // end of loop
				} // end of loop
			} // end of try
			catch (InputMismatchException ime) {
				System.out.println("Enter only Integer Values...");
				ime.getMessage();
			} // end of catch
		} // end of try-with-resource
	}// main
}// class