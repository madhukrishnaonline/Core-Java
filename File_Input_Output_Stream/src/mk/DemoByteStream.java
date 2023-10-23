package mk;

import java.util.*;
import java.io.*;

@SuppressWarnings("serial")
public class DemoByteStream extends Exception {
	public DemoByteStream(String msg) {
		super(msg);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				System.out.println("Enter the File Name & File Path:(Source)");
				File f1 = new File(sc.nextLine());
				if (!(f1.exists())) {
					DemoByteStream dbs = new DemoByteStream("Invalid File Path...");
					throw dbs;
				}
				FileInputStream fis = new FileInputStream(f1);
				System.out.println("Enter the File Name & File Path:(Destination)");
				File f2 = new File(sc.nextLine());
				FileOutputStream fos = new FileOutputStream(f2);
				int k;
				while ((k = fis.read()) != -1) {
					fos.write(k);
				} // end of while
				System.out.println("File Stored Successfully...");
				fos.close();
				fis.close();
			} // end of try
			catch (DemoByteStream dbs) {
				System.out.println(dbs.getMessage());
				// dbs.printStackTrace();
			} // end of catch
		} // end of try-with-resource
	}//main
}//class