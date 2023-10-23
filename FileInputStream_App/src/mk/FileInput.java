package mk;

import java.util.*;
import java.io.*;

public class FileInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				System.out.println("Enter the path/FileName:(source)");
				File f1 = new File(sc.nextLine());
				if (f1.exists()) {
					FileInputStream fis = new FileInputStream(f1);
					System.out.println("Enter the path/FileName:(Destination)");
					File f2 = new File(sc.nextLine());
					if (f2.exists()) {
						FileOutputStream fos = new FileOutputStream(f2);
						int f;
						while ((f = fis.read()) != -1) {
							fos.write(f);
						} // end of loop
						System.out.println("File Copied Successfully...");
						fos.close();
						fis.close();
					} // end of if
					else {
						System.out.println("Invalid File Path...");
					}
				} // end of if
				else {
					System.out.println("Invalid File Path...");
				} // else
			} // end of try
			catch (Exception e) {
				e.printStackTrace();
			} // catch
		} // end of try-with-resource
	}// main
}// class