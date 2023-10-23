package mk;

import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class DemoBufferReader {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String path = "M:\\Java Files\\Text.txt";
			FileWriter fw = new FileWriter(path);
			System.out.println("Enter the Data:(@ at end)");
			char ch1;
			while ((ch1 = (char) br.read()) != '@') {
				fw.write(ch1);
			}
			System.out.println("Data Stored in file Successfully....");
			fw.close();
			System.out.println("===Displaying Data from File===");
			FileReader fr = new FileReader(path);
			int k;
			while ((k = fr.read()) != -1) {
				System.out.print((char) k);
			}
			fr.close();
		} // end of try
		catch (Exception ex) {
			ex.printStackTrace();
		} // end of catch
	}//main
}//class