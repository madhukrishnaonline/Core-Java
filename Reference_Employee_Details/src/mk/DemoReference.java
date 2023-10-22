package mk;

import test.*;
import java.util.*;

public class DemoReference // Converting ref to inheritance
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				Display dis = new Display();
				dis.readEmployee(sc);
				dis.displayStudent();
			}//try
			catch (Exception ex){
				ex.printStackTrace();
			}//catch
		}//try-with-resource
	}//main
}//class