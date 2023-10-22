package mk;

import java.util.*;

public class CollectionFrame {
	@SuppressWarnings({ "removal", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			// Collection<Integer> ob = null;
			// String s = null;
			try {
				mk: // label
				while (true) {
					System.out.println("***Extensions Of Collection<E>***");
					System.out.println("1.Set<E>\n2.List<E>\n3.Queue<E>\n4.Exit");
					System.out.println("Select any one Option:");
					switch (sc.nextInt()) {
					case 1:
						Set<Integer> st = null;
						kk: // label
						while (true) {
							System.out.println("Operations On Implementations of Set<Integer>");
							System.out.println("1.HashSet<E>\n2.LinkedHashSet<E>\n3.TreeSet<E>\n4.Exit");
							System.out.println("Select Any Option:");
							int opt = sc.nextInt();
							switch (opt) {
							case 1:
								st = new HashSet<Integer>();
								mkk: // label
								while (true) {
									System.out.println("Operations On HashSet<Integer>");
									System.out.println("1.add<E>\n2.remove<e>\n3.contains<E>\n4.exit");
									System.out.println("Select Any one:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										st.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + st.toString());
										break;
									case 2:
										if (st.isEmpty()) {
											System.out.println("HashSet is Empty....");
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											int i = sc.nextInt();
											if (st.remove(i)) {
												System.out.println("Element removed..." + i);
												System.out.println("Remaining Elements: " + st);
											} else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										if (st.isEmpty()) {
											System.out.println("Set is Empty...");
										} // end of if
										else {
											System.out.println("Enter Element to be Search:");
											Integer c = new Integer(sc.nextInt());
											if (st.contains(c)) {
												System.out.println("The Element Available:" + c.toString());
											} // end of if
											else {
												System.out.println("Element not Available.....");
											} // end of else
										} // end of else
										break;
									case 4:
										System.out.println("Operations On HashSet Stopped...");
										break kk;
									default:
										System.out.println("Invalid Option...");
										break;
									}// end of switch HashSet<E>
									continue;
								} // end of 3rd while
							case 2:
								st = new LinkedHashSet<Integer>();
								aa: // label
								while (true) {
									System.out.println("Operations On LinkedHashSet<Integer>");
									System.out.println("1.add<E>\n2.remove<e>\n3.contains<E>\n4.exit");
									System.out.println("Select Any one:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										st.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + st.toString());
										break;
									case 2:
										if (st.isEmpty()) {
											System.out.println("LinkedHashSet is Empty....");
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											int i = sc.nextInt();
											if (st.remove(i)) {
												System.out.println("Element removed..." + i);
												System.out.println("Remaining Elements: " + st);
											} // if
											else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										if (st.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...");
										} // end of if
										else {
											System.out.println("Enter Element to be Search:");
											Integer d = new Integer(sc.nextInt());
											if (st.contains(d)) {
												System.out.println("The Element Available:" + d.toString());
											} // end of if
											else {
												System.out.println("Element not Available.....");
											} // end of else
										} // end of else
										break;
									case 4:
										System.out.println("Operations On LinkedHashSet has been Stopped...");
										break kk;
									default:
										System.out.println("Invalid Option...");
										break;
									}// end of switch LinkedHashSet<Integer>
									continue;
								} // end of 4th while
							case 3:
								st = new TreeSet<Integer>();
								mm: // label
								while (true) {
									System.out.println("Operations On TreeSet<Integer>");
									System.out.println("1.add<E>\n2.remove<e>\n3.contains<E>\n4.exit");
									System.out.println("Select Any one:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										st.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + st.toString());
										break;
									case 2:
										if (st.isEmpty()) {
											System.out.println("LinkedHashSet is Empty....");
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											int t = sc.nextInt();
											if (st.remove(t)) {
												System.out.println("Element removed..." + t);
												System.out.println("Remaining Elements: " + st);
											} else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										if (st.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...");
										} // end of if
										else {
											System.out.println("Enter Element to be Search:");
											Integer ts = new Integer(sc.nextInt());
											if (st.contains(ts)) {
												System.out.println("The Element Available:" + ts.toString());
											} // end of if
											else {
												System.out.println("Element not Available.....");
											} // end of else
										} // end of else
										break;
									case 4:
										System.out.println("Operations On TreeSet has been Stopped...");
										break kk;
									default:
										System.out.println("Invalid Option...");
										break;
									}// end of switch TreeSet<Integer>
									continue;
								} // end of 5th while
							case 4:
								System.out.println("Set<E> Operations Stopped...");
								break kk;
							default:
								System.out.println("Invalid Option...");
								break;
							}// end of switch Set<E>
							continue;
						} // end of 2nd while
					case 2:
						List<Integer> li = null;
						ww: // label
						while (true) {
							System.out.println("Operations On Implementations of List<E>");
							System.out.println("1.ArrayList\n2.LinkedList\n3.Vector\n4.exit");
							System.out.println("Select Any one:");
							switch (sc.nextInt()) {
							case 1:
								li = new ArrayList<Integer>();
								ar: // label
								while (true) {
									System.out.println("Operations On ArrayList<Integer>");
									System.out.println("1.add<E>\n2.remove<e>\n3.contains<E>\n4.exit");
									System.out.println("Select Any one:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										li.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + li.toString());
										break;
									case 2:
										if (li.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...." + li);
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											Integer ele = new Integer(sc.nextInt());
											if (li.remove(ele)) {
												System.out.println("Element removed..." + ele);
												System.out.println("Remaining Elements: " + li);
											} else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										if (li.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...");
										} // end of if
										else {
											System.out.println("Enter Element to be Search:");
											Integer lis = new Integer(sc.nextInt());
											if (li.contains(lis)) {
												System.out.println("The Element Available:" + lis.toString());
											} // end of if
											else {
												System.out.println("Element not Available.....");
											} // end of else
										} // end of else
										break;
									case 4:
										System.out.println("Operations On ArrayList has been Stopped...");
										break ar;
									default:
										System.out.println("Invalid Option...");
										break;
									}// end of switch ArrayList
									continue;
								} // end of 7th loop
							case 2:
								li = new LinkedList<Integer>();
								ll: // label
								while (true) {
									System.out.println("Operations On ArrayList<Integer>");
									System.out.println("1.add<E>\n2.remove<e>\n3.contains<E>\n4.exit");
									System.out.println("Select Any one:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										li.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + li.toString());
										break;
									case 2:
										if (li.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...." + li);
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											Integer lin = new Integer(sc.nextInt());
											if (li.remove(lin)) {
												System.out.println("Element removed..." + lin);
												System.out.println("Remaining Elements: " + li);
											} else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										if (li.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...");
										} // end of if
										else {
											System.out.println("Enter Element to be Search:");
											Integer linn = new Integer(sc.nextInt());
											if (li.contains(linn)) {
												System.out.println("The Element Available:" + linn.toString());
											} // end of if
											else {
												System.out.println("Element not Available.....");
											} // end of else
										} // end of else
										break;
									case 4:
										System.out.println("Operations On LinkedList has been Stopped...");
										break ll;
									default:
										System.out.println("Invalid Option...");
										break;
									}// end of switch LinkedList
									continue;
								} // end of 8 while
							case 3:
								li = new Vector<Integer>();
								v: // label
								while (true) {
									System.out.println("Operations On Vector<Integer>");
									System.out.println("1.add<E>\n2.remove<e>\n3.contains<E>\n4.exit");
									System.out.println("Select Any one:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										li.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + li.toString());
										break;
									case 2:
										if (li.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...." + li);
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											Integer lin = new Integer(sc.nextInt());
											if (li.remove(lin)) {
												System.out.println("Element removed..." + lin);
												System.out.println("Remaining Elements: " + li);
											} else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										if (li.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...");
										} // end of if
										else {
											System.out.println("Enter Element to be Search:");
											Integer linn = new Integer(sc.nextInt());
											if (li.contains(linn)) {
												System.out.println("The Element Available:" + linn.toString());
											} // end of if
											else {
												System.out.println("Element not Available.....");
											} // end of else
										} // end of else
										break;
									case 4:
										System.out.println("Operations On Vector has been Stopped...");
										break;
									default:
										System.out.println("Invalid Option...");
										break;
									}// end of switch
									continue;
								} // end of 9 loop
							case 4:
								System.out.println("Operations on Vector<E> stopped....");
								break ww;
							default:
								System.out.println("Invalid Choice...");
								break;
							}// end of switch List<E>
							break;
						} // end of 6th loop
					case 3:
						Queue<Integer> qe = null;
						abc: while (true) {
							System.out.println("Operations on Implementations of Queue<E>");
							System.out.println("1.PriorityQueue<E>\n2.ArrayDeque<E>\n3.Exit");
							System.out.println("Select Any One Option:");
							switch (sc.nextInt()) {
							case 1:
								qe = new PriorityQueue<Integer>();
								bc: // label
								while (true) {
									System.out.println("Operations on PriorityQueue<E>");
									System.out.println("1.add(E)\n2.remove(O)\n3.exit");
									System.out.println("Select Any One Option:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										qe.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + qe.toString());
										break;
									case 2:
										if (qe.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...." + qe);
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											Integer lin = new Integer(sc.nextInt());
											if (qe.remove(lin)) {
												System.out.println("Element removed..." + lin);
												System.out.println("Remaining Elements: " + qe);
											} else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										System.out.println("Operations Stopped on priorityQueue...");
										break bc;
									default:
										System.out.println("Invalid Choice...");
										break;
									}// end of switch
									continue;
								} // end of loop
							case 2:
								qe = new ArrayDeque<Integer>();
								cc: while (true) {
									System.out.println("Operations on PriorityQueue<E>");
									System.out.println("1.add(E)\n2.remove(O)\n3.exit");
									System.out.println("Select Any One Option:");
									switch (sc.nextInt()) {
									case 1:
										System.out.println("Enter the Element to be add:");
										qe.add(new Integer(sc.nextInt()));
										System.out.println("The Element Added:" + qe.toString());
										break;
									case 2:
										if (qe.isEmpty()) {
											System.out.println("LinkedHashSet is Empty...." + qe);
										} // end of if
										else {
											System.out.println("Enter element to be removed:");
											Integer lin = new Integer(sc.nextInt());
											if (qe.remove(lin)) {
												System.out.println("Element removed..." + lin);
												System.out.println("Remaining Elements: " + qe);
											} else {
												System.out.println("Element not Available...");
											} // end of else
										} // end of else
										break;
									case 3:
										System.out.println("Operations Stopped on priorityQueue...");
										break cc;
									default:
										System.out.println("Invalid Choice...");
										break;
									}// end of switch
									continue;
								} // end of loop
							case 3:
								System.out.println("Operations On Queue Stopped...");
								break abc;
							default:
								System.out.println("Invalid choice....");
								break;
							}// end of switch
							break;
						} // end of loop
					case 4:
						System.out.println("Program terminated...");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Option....");
						break;
					}// end of switch Collection
				} // end of while
			} // end of try
			catch (Exception ex) {
				ex.printStackTrace();
			} // end of catch
		} // end of try-with-resource
	}// main
}// class