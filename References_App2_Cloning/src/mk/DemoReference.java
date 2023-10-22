package mk;
import test.*;
import java.util.*;
public class DemoReference 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				Actor a = new Actor();
				System.out.println("Enter Actor Name:");
				a.aName = sc.nextLine();
				System.out.println("Enter Actor ADdress:");
				a.addr = sc.nextLine();
				System.out.println("Enter Actor h/No:");
				a.hNo = sc.nextLine();
				System.out.println("Enter Actor MailId:");
				a.mailId = sc.nextLine();
				System.out.println("Enter Actor phoneNo.:");
				a.phoneNo = sc.nextLong();
				System.out.println("Enter Actor Remuneration:");
				a.remun = sc.nextDouble();
				System.out.println("****Original Object***");
				System.out.println("***Displaying Actor Details***");
				System.out.println(a.toString());
				System.out.println("****HashCodes of Object****");
				System.out.println("HashCode of Actor: "+a.hashCode());
				Actor o = (Actor)a.cloning();
				System.out.println("****Cloned Object***");
				System.out.println("***Displaying Actor Details***");
				System.out.println(o.toString());
				System.out.println("****HashCodes of Object****");
				System.out.println("HashCode of Actor: "+o.hashCode());
			}//try
			catch(Exception ex)
			{
				ex.printStackTrace();
			}//catch
		}//end of try-with-resource
	}//main
}//class