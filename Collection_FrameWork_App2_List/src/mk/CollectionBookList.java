package mk;

import java.util.*;
import test.BookDetails;

public class CollectionBookList {
	@SuppressWarnings({ "unchecked", "rawtypes", "removal", "unlikely-arg-type" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				List<BookDetails> ob = null;
				while (true) {
					System.out.println("***Implementations On List<E> Operations***");
					System.out.println("1.ArrayList\n2.LinkedList\n3.Vector\n4.exit");
					System.out.println("Select the Option:");
					Integer i = new Integer(Integer.parseInt(sc.nextLine()));
					/*
					 * if(i<0) { NumberFormatException nfe = new
					 * NumberFormatException("Invalid Value..."); throw nfe; }
					 */
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
						switch (Integer.parseInt(sc.nextLine())) {
						case 1:
							System.out.println("Enter the BookName:");
							String bkName = new String(sc.nextLine());
							System.out.println("Enter the Publisher Name:");
							String publisher = new String(sc.nextLine());
							System.out.println("Enter the Author Name:");
							String author = new String(sc.nextLine());
							System.out.println("Enter the Price:");
							Double price = Double.parseDouble(sc.nextLine());
							ob.add(new BookDetails(bkName, publisher, author, price));
							System.out.println("===Displaying Product Details Using Iterator===");
							Iterator<BookDetails> it1 = ob.iterator();
							while (it1.hasNext()) {
								System.out.println("The Books :" + it1.next().toString());
							} // end of loop
							break;
						case 2:
							System.out.println("Enter the BookName to be search:");
							String srch = new String(sc.nextLine());
							Iterator<BookDetails> it2 = ob.iterator();
							while (it2.hasNext()) {
								BookDetails bd = (BookDetails) it2.next();
								if (bd.bkName.equals(srch)) {
									if (ob.contains(bd)) {
										System.out.println("The Book Available:" + srch.toString());
										System.out.println("Total Books :" + ob.toString());
									} // if
									else {
										System.out.println("No Book was found..." + ob);
									} // else
								} // end of if
							} // end of loop
							break;
						case 3:
							if (ob.isEmpty()) {
								System.out.println("No Books Available...");
							} // end of if
							else {
								System.out.println("Enter the BookName to be Remove:");
								String rem = new String(sc.nextLine());
								Iterator<BookDetails> it3 = ob.iterator();
								while (it3.hasNext()) {
									BookDetails bd = (BookDetails) it3.next();
									if (bd.bkName.equals(rem)) {
										if (ob.remove(bd)) {
											System.out.println("Book Removed :" + rem);
											System.out.println("Remaining Books:" + ob.toString());
										} // end of if
										else {
											System.out.println("Book not Available...");
										} // end of else
									} // end of else
								} // end of if
							} // end of loop
							break;
						case 4:
							if (ob.isEmpty()) {
								System.out.println("Index is empty...");
							} // if
							else {
								System.out.println("Enter the index :");
								Integer index1 = new Integer(Integer.parseInt(sc.nextLine()));
								if (index1 >= 0 && index1 < ob.size()) {
									System.out.println("Enter the BookName:");
									String ibkName = new String(sc.nextLine());
									System.out.println("Enter the Publisher Name:");
									String ipublisher = new String(sc.nextLine());
									System.out.println("Enter the Author Name:");
									String iauthor = new String(sc.nextLine());
									System.out.println("Enter the Price:");
									Double iprice = Double.parseDouble(sc.nextLine());
									ob.add(index1, new BookDetails(ibkName, ipublisher, iauthor, iprice));
									Iterator<BookDetails> it4 = ob.iterator();
									while (it4.hasNext()) {
										BookDetails bd1 = (BookDetails) it4.next();
										System.out.println("The Book " + bd1 + " added");
										System.out.println("Total Books :" + ob.toString());
									} // end of loop
								} // end of if
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
								Integer index2 = new Integer(Integer.parseInt(sc.nextLine()));
								if (index2 >= 0 && index2 < ob.size()) {
									System.out.println("Enter the BookName to be remove from Index:");
									String bk = new String(sc.nextLine());
									ob.remove(bk);
									System.out.println("The Book " + bk + " removed");
									System.out.println("Remaining Books :" + ob.toString());
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
								Integer index3 = new Integer(Integer.parseInt(sc.nextLine()));
								if (index3 >= 0 && index3 < ob.size()) {
									System.out.println("Enter the BookName:");
									String ibkName = new String(sc.nextLine());
									System.out.println("Enter the Publisher Name:");
									String ipublisher = new String(sc.nextLine());
									System.out.println("Enter the Author Name:");
									String iauthor = new String(sc.nextLine());
									System.out.println("Enter the Price:");
									Double iprice = Double.parseDouble(sc.nextLine());
									ob.set(index3, new BookDetails(ibkName, ipublisher, iauthor, iprice));
									Iterator<BookDetails> it5 = ob.iterator();
									while (it5.hasNext()) {
										BookDetails bd2 = (BookDetails) it5.next();
										System.out.println("The Book " + bd2 + " added");
										System.out.println("Total Books :" + ob.toString());
									} // end of loop
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
									// ele = ob.get(index4);
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
			catch (Exception nfe) {
				System.out.println("Enter Only Integer Values...");
				// nfe.printStackTrace();
			} // catch
		} // end of try-with-resource
	}// main
}// class