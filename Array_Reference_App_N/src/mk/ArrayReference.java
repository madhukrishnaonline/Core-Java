package mk;

import test.*;
import java.util.*;

public class ArrayReference 
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try (sc;) 
		{
			try 
			{
				System.out.println("Enter the Size of an Array:");
				Integer n = new Integer(Integer.parseInt(sc.nextLine()));
				Actor[] a = new Actor[n];
				System.out.println("Enter the " + n + " Objects:");
				for (int i = 0; i < a.length; i++) 
				{
					a[i] = new Actor(new Contact());
					System.out.println("Enter Actor Name:");
					a[i].aName = new String(sc.nextLine());
					System.out.println("Enter Actor Address:");
					a[i].addr = new String(sc.nextLine());
					System.out.println("Enter Actor h/No:");
					a[i].hNo = new String(sc.nextLine());
					System.out.println("Enter Actor MailId:");
					a[i].ob.mailId = new String(sc.nextLine());
					System.out.println("Enter Actor phoneNo.:");
					a[i].ob.phoneNo = new Long(Long.parseLong(sc.nextLine()));
					System.out.println("Enter Actor Remuneration:");
					a[i].remun = new Double(Double.parseDouble(sc.nextLine()));
				} // end of loop
				System.out.println("****Original Object***");
				System.out.println("***Displaying Actor Details***");
				for (Actor ac : a) 
				{
					System.out.println(ac.toString());
					System.out.println("****HashCodes of Object****");
					System.out.println("HashCode of Actor: " + ac.hashCode());
					System.out.println("HashCode of Contact: " + ac.ob.hashCode());
				} // end of loop
			} // end of try
			catch (Exception ex) 
			{
				System.out.println("Enter Integer Data Only....");
				ex.printStackTrace();
			} // catch
		} // end of try-with-resource
	}// main
}// class