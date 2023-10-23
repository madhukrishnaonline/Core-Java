package mk;
import java.util.*;
import test.*;
@SuppressWarnings("serial")
public class DemoException extends Exception
{
	public DemoException(String msg)
	{
		super(msg);
	}
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				System.out.println("Enter the HostelName: ");
				String hName = new String(sc.nextLine());
				System.out.println("Enter the HostelType: ");
				String hType  = new String(sc.nextLine());
				System.out.println("Enter the Address: ");
				String addr = new String(sc.nextLine());
				System.out.println("Enter the Hostel Fee: ");
				Integer hFee = new Integer(sc.nextInt());
				if(!(hFee<=6000))
				{
				   DemoException de = new DemoException("Invalid Hostel Fee");
				   throw de;
				}
				HostelDetails hd = new HostelDetails(hName,hType,addr,hFee);
				System.out.println("====Hostel Details====");
				System.out.println(hd+" ");
			}//end of try
			catch(InputMismatchException ime)
			{
			    System.out.println("Enter the Integer Data Only....");
				ime.printStackTrace();
			}
			catch(DemoException de)
			{
				System.out.println(de.getMessage());
			}
		}//end of try-with-resource
	}//main
}//class