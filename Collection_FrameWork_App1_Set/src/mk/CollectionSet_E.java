package mk;

import java.util.*;

public class CollectionSet_E {
	@SuppressWarnings({ "removal", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s = null;
		Set<Integer> ob = null;
		try (sc;) {
			try {
				while (true) {
					System.out.println("***Implementations On Set Operations***");
					System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet\n4.exit");
					System.out.println("Select the Option:");
					Integer o = new Integer(sc.nextInt());
					switch (o) {
					case 1:
						ob = new HashSet();
						System.out.println("Operations on HashSet");
						break;
					case 2:
						ob = new LinkedHashSet();
						System.out.println("Operations on LinkedHashSet");
						break;
					case 3:
						ob = new TreeSet();
						System.out.println("Operations on TreeSet");
						break;
					case 4:
						System.out.println("Set Operations Stopped...");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Option...");
						continue;
					}// end of switch
					mk: // label
					while (true) {
						System.out.println("====Choice====");
						System.out.println("1.add\n2.CheckElements\n3.remove\n4.exit");
						System.out.println("Select the Choice:");
						switch (sc.nextInt()) {
						case 1:
							System.out.println("Enter the Element to be Added:");
							ob.add(new Integer(sc.nextInt()));
							System.out.println("The Elements:" + ob.toString());
							break;
						case 2:
							System.out.println("Enter the Element to be search:");
							if (ob.contains(new Integer(sc.nextInt()))) {
								System.out.println("The Elements Available:" + ob.toString());
							} /// if
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
							System.out.println("Operation Stopped ...");
							break mk;
						default:
							System.out.println("Invalid choice...");
							break mk;
						}// end of switch
					} // end of loop
				} // end of loop
			} // end of try
			catch (InputMismatchException ex) {
				System.out.println("Enter only Integer Values...");
				// ex.printStackTrace();
			} // end of catch
		} // end of try-with-resource
	}// main
}// class