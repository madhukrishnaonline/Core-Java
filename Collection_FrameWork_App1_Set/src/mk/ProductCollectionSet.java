package mk;

import test.Product;
import java.util.*;

public class ProductCollectionSet {
	@SuppressWarnings({ "removal", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s = null;
		Set<Product> ob = null;
		try (sc;) {
			// int count=0;
			try {
				while (true) {
					System.out.println("***Implementations On Set Operations***");
					System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet\n4.exit");
					System.out.println("Select the Option:");
					Integer o = new Integer(Integer.parseInt(sc.nextLine()));
					if (o < 0) {
						NumberFormatException nfe = new NumberFormatException("Invalid Integer Value....");
						throw nfe;
					} // if
					switch (o) {
					case 1:
						ob = new HashSet();
						// s = "HashSet<E>";
						System.out.println("Operations on HashSet<E>");
						break;
					case 2:
						ob = new LinkedHashSet();
						// s = "LinkedHashSet<E>";
						System.out.println("Operations on LinkedHashSet<E>");
						break;
					case 3:
						ob = new TreeSet();
						// s = "TreeSet<E>";
						System.out.println("Operations on TreeSet<E>");
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
						System.out.println("1.add\n2.CheckElements\n3.remove\n4.exit");
						System.out.println("Select the Choice:");
						switch (Integer.parseInt(sc.nextLine())) {
						case 1:
							System.out.println("Enter the Product Id:");
							String code = new String(sc.nextLine());
							System.out.println("Enter the Product Name:");
							String name = new String(sc.nextLine());
							System.out.println("Enter the Product Price:");
							Float price = new Float(Float.parseFloat(sc.nextLine()));
							System.out.println("Enter the Product Quantity:");
							Integer qty = new Integer(Integer.parseInt(sc.nextLine()));
							ob.add(new Product(code, name, price, qty));
							// System.out.println("The Elements :"+ob.toString());
							System.out.println("===Displaying Product Details Using Iterator===");
							Iterator<Product> it1 = ob.iterator();
							while (it1.hasNext()) {
								System.out.println("The Elements :" + it1.next().toString());
							} // end of loop
							System.out.println("===Displaying Product Details Using Iterator<E>(Java8)===");
							Iterator<Product> it2 = ob.iterator();
							it2.forEachRemaining((r) -> {
								System.out.println("The Elements :" + r.toString());
							});
							System.out.println("===Displaying Product Details Using Spliterator<E>(Java8)===");
							Spliterator<Product> sp = ob.spliterator();
							sp.forEachRemaining((pl) -> {
								System.out.println("The Elements :" + pl.toString());
							});
							System.out.println("===Displaying Product Details Using forEach()(Java8)===");
							ob.forEach((e) -> {
								System.out.println("The Elemnts :" + e.toString());
							});
							break;
						case 2:
							System.out.println("Enter the Element to be search:");
							String srch = new String(sc.nextLine());
							Iterator<Product> it4 = ob.iterator();
							while (it4.hasNext()) {
								Product pro = (Product) it4.next();
								if (pro.name.equals(srch)) {
									if (ob.contains(pro)) {
										System.out.println("The Elements Available:" + srch.toString());
									} // if
									else {
										System.out.println("No Elements found..." + ob);
									} // else
								} // end of if
							} // end of loop
							break;
						case 3:
							if (ob.isEmpty()) {
								System.out.println("No Elements Available...");
							} // end of if
							else {
								System.out.println("Enter the Element to be Remove:");
								String ele = new String(sc.nextLine());
								Iterator<Product> it3 = ob.iterator();
								while (it3.hasNext()) {
									Product p = (Product) it3.next();
									if (p.name.equals(ele)) {
										if (ob.remove(p)) {
											System.out.println("Elements Removed :" + ele);
											System.out.println("Remaining Elements:" + ob.toString());
										} // end of if
										else {
											System.out.println("Element not Available...");
										} // end of else
									} // end of if
								} // end of loop
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
			catch (NumberFormatException nfe) {
				System.out.println("Enter Integer Values Only....");
				nfe.toString();
			} // end of catch
		} // end of try-with-resource
	}// main
}// class