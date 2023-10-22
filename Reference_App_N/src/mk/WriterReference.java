package mk;
import test.*;
import java.util.*;
public class WriterReference 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				WriterDetails wd = new WriterDetails();
				System.out.println("Enter Writer Name:");
				wd.wName = sc.nextLine();
				System.out.println("Enter Writer mailId:");
				wd.mailId = sc.nextLine();
				System.out.println("Enter Writer Addres:");
				wd.addr = sc.nextLine();
				System.out.println("Enter Writer HouseNo.:");
				wd.hNo = sc.nextLine();
				System.out.println("Enter Writer PhoneNo:");
				wd.phoneNo = sc.nextLong();
				System.out.println("===Writer Details===");
				System.out.println(wd.toString());
				//System.out.println(wd.wc.toString());
				System.out.println("***HashCodes of Object***");
				System.out.println("HashCode of WriterDetails: "+wd.hashCode());
				//System.out.println("HashCode of WriterContact: "+wd.wc.hashCode());
			}//try
			catch(Exception ex)
			{
				System.out.println("Enter Integer Data Only....");
				ex.printStackTrace();
			}//catch
		}//end of try-with-resource
	}//main
}//class