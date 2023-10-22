package mk;

import java.util.*;
import test.EmployeeValues;

public class Map_K_V {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				Map<String, EmployeeValues> m = null;
				String s = null;
				while (true) {
					System.out.println("***Implementations on Map<K,V>***");
					System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable\n5.exit");
					System.out.println("Enter the Option:");
					switch (new Integer(Integer.parseInt(sc.nextLine()))) {
					case 1:
						m = new HashMap<String, EmployeeValues>();
						s = "Operations On HashMap<K,V>";
						break;
					case 2:
						m = new LinkedHashMap<String, EmployeeValues>();
						s = "Operations on LinkedHashMap<K,V>";
						break;
					case 3:
						m = new TreeMap<String, EmployeeValues>();
						s = "Operations on TreeMap<K,V>";
						break;
					case 4:
						m = new Hashtable<String, EmployeeValues>();
						s = "Opeartions on Hashtable<K,V>";
						break;
					case 5:
						System.out.println("Operations On Map<K,V> Stopped...");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Choice...");
						break;
					}// end of switch
					System.out.println("Perform " + s);
					mk: while (true) {
						System.out.println("===Choice===");
						System.out.println(
								"1.put(K,V)\n2.display\n3.get(obj)\n4.remove(obj)\n5.keySet()\n6.values\n7.clear\n8.SearchKey\n9.exit");
						System.out.println("Enter the Choice:");
						switch (new Integer(Integer.parseInt(sc.nextLine()))) {
						case 1:
							System.out.println("Enter Employee Id:");
							String eId = new String(sc.nextLine());
							System.out.println("Enter Employee Name:");
							String eName = new String(sc.nextLine());
							System.out.println("Enter Employee Designation:");
							String eDesg = new String(sc.nextLine());
							System.out.println("Enter Employee Basic salary:");
							Integer bSal = new Integer(Integer.parseInt(sc.nextLine()));
							float totSal = bSal * 12;
							// System.out.println("Total salary :"+totSal);
							m.put(new String(eId), new EmployeeValues(eName, eDesg, bSal, totSal));
							System.out.println("Employee Details Added...");
							break;
						case 2:
							if (m.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("**Employee Details**");

								m.forEach((p, q) -> {
									System.out.println(p + " " + q);
								});
							} // else
							break;
						case 3:
							if (m.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("Enter the Element to be get:");
								String id = sc.nextLine();
								EmployeeValues emp = m.get(id);
								System.out.println(emp.toString());
							} // else
							break;
						case 4:
							if (m.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("Enter the Element to be remove:");
								String id1 = sc.nextLine();
								EmployeeValues emp1 = m.remove(id1);
								System.out.println("Element Removed: " + emp1.toString());
							} // else
							break;
						case 5:
							if (m.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								Set<String> ks = m.keySet();
								ks.forEach((k) -> {
									System.out.println(k);
								});
							} // else
							break;
						case 6:
							if (m.isEmpty()) {
								System.out.println("Map is Empty...");
							} else {
								System.out.println(m.values());
							}
							break;
						case 7:
							if (m.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								m.clear();
								System.out.println("Data Cleared" + m.toString());
							} // else
							break;
						case 8:
							if (m.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("Enter the Key to search:");
								String key = new String(sc.nextLine());
								if (m.containsKey(key)) {
									System.out.println("keyId found: " + key);
								} // if
								else {
									System.out.println("No Keys found....");
								} // else
							} // else
							break;
						case 9:
							System.out.println(s + " Stopped...");
							break mk;
						default:
							System.out.println("Invalid Choice....");
							break;
						}// switch
					} // end of loop
				} // end of loop
			} // end of try
			catch (Exception ex) {
				System.out.println("");
				ex.printStackTrace();
			} // catch
		} // end of try-with-resource
	}// main
}// class