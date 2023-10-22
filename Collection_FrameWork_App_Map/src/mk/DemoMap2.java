package mk;

import java.util.*;
import test.*;

public class DemoMap2 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				Map<String, EmployeeValues> mp = null;
				String s = null;
				while (true) {
					System.out.println("Implementations of Map<K,V>");
					System.out
							.println("1.HashMap<k,V>\n2.LinkedHashMap<k,v>\n3.TreeMap<k,v>\n4.Hashtable<k,v>\n5.exit");
					System.out.println("Select Any One Option:");
					switch (new Integer(Integer.parseInt(sc.nextLine()))) {
					case 1:
						mp = new HashMap<String, EmployeeValues>();
						s = "Operations On HashMap<k,v>";
						break;
					case 2:
						mp = new LinkedHashMap<String, EmployeeValues>();
						s = "Operations On LinkedHashMap<k,v>";
						break;
					case 3:
						mp = new TreeMap<String, EmployeeValues>();
						s = "Operations On TreeMap<k,v>";
						break;
					case 4:
						mp = new Hashtable<String, EmployeeValues>();
						s = "Operations On Hashtable<k,v>";
						break;
					case 5:
						System.out.println("Operations Stopped....");
						System.exit(0);
					default:
						System.out.println("Invalid Choice....");
						break;
					}// end of switch
					System.out.println("Performing " + s);
					kk: // label
					while (true) {
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
							mp.put(new String(eId), new EmployeeValues(eName, eDesg, bSal, totSal));
							System.out.println("Employee Details Added...");
							break;
						case 2:
							if (mp.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("**Employee Details**");
								mp.forEach((p, q) -> {
									System.out.println(p + " " + q);
								});
							} // else
							break;
						case 3:
							if (mp.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("Enter the Element to be get:");
								String id = new String(sc.nextLine());
								EmployeeValues emp = mp.get(id);
								System.out.println(emp.toString());
							} // else
							break;
						case 4:
							if (mp.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("Enter the Element to be remove:");
								String id1 = sc.nextLine();
								EmployeeValues emp1 = mp.remove(id1);
								System.out.println("Element Removed: " + emp1.toString());
							} // else
							break;
						case 5:
							if (mp.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								Set<String> ks = mp.keySet();
								ks.forEach((k) -> {
									System.out.println(k);
								});
							} // else
							break;
						case 6:
							if (mp.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println(mp.values());
							} // else
							break;
						case 7:
							if (mp.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								mp.clear();
								System.out.println("Data Cleared" + mp.toString());
							} // else
							break;
						case 8:
							if (mp.isEmpty()) {
								System.out.println("Map is Empty...");
							} // if
							else {
								System.out.println("Enter the Key to search:");
								String key = new String(sc.nextLine());
								if (mp.containsKey(key)) {
									System.out.println("keyId found: " + key);
								} // if
								else {
									System.out.println("No Keys found....");
								} // else
							} // else
							break;
						case 9:
							System.out.println(" Stopped...");
							break kk;
						default:
							System.out.println("Invalid Choice....");
							break;
						}// end of switch
					} // end of loop Inner
				} // end of loop Outer
			} // end of try
			catch (Exception ex) {
				ex.printStackTrace();
			} // catch
		} // end of try-with-resource
	}// main
}// class