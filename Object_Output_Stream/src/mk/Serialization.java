package mk;

import java.io.*;
import java.util.*;
import test.*;

public class Serialization {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				System.out.println("Enter Home Account No.: ");
				Long hAccNo = new Long(sc.nextLong());
				System.out.println("Enter Benificiary Account No.: ");
				Long bAccNo = new Long(sc.nextLong());
				System.out.println("Enter Amount to be send: ");
				Double amt = new Double(sc.nextDouble());
				TransLog tl = new TransLog(hAccNo, bAccNo, amt, new Date());
				String str = "M:\\Java Files\\obj.txt";
				FileOutputStream fos = new FileOutputStream(str);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(tl);
				System.out.println("Object Stored Successfully....");
				oos.close();
				fos.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} // end of try-with-resource
	}//main
}//class