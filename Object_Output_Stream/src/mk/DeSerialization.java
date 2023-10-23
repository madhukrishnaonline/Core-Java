package mk;

import test.TransLog;
import java.io.*;

public class DeSerialization {
	public static void main(String[] args) {
		try {
			String str2 = "M:\\Java Files\\obj.txt";
			FileInputStream fis = new FileInputStream(str2);
			ObjectInputStream ois = new ObjectInputStream(fis);
			TransLog tl2 = (TransLog) ois.readObject();
			System.out.println("***Transaction Details***");
			System.out.println("hAccNo: " + tl2.gethAccNo());
			System.out.println("bAccNo: " + tl2.getbAccNo());
			System.out.println("Amount :" + tl2.getAmt());
			System.out.println("Date Time: " + tl2.getDateTime());
			ois.close();
			fis.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}//main
}//class