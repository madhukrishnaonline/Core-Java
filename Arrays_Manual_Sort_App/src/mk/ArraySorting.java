package mk;
import java.util.*;
import test.*;
public class ArraySorting 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<CarDetails> s = new ArrayList<CarDetails>();
		 s.add(new CarDetails("Bmw","3 Series",4000000));
		 s.add(new CarDetails("Range","Land Rover",6000000));
		 s.add(new CarDetails("Rolls Royce","Cullinan",30000000));
		 s.add(new CarDetails("Ford","EcoSport",300000));
	     s.add(new CarDetails("Tata","Nexon",200000));
		 System.out.println("===Before Sorting===");
		 s.forEach((f)->
		 {
			 System.out.println(f.toString());
		 });
		 System.out.println("====Choice====");
		 System.out.println("1.SortByCarName\n2.SortByCarModel\n3.SortByCarPrice");
		 System.out.println("Enter the Choice:");
		 switch(new Integer(sc.nextInt()))
		 {
		 case 1:
			 System.out.println("***Ascending Order***");
			   s.sort(new SortByName());
			   s.forEach((fe)->
			   {
				   System.out.println(fe.toString());
			   });
			   System.out.println("****Descending Order****");
			   for(int i=s.size()-1;i>=0;i--)
			   {
				   System.out.println(s.get(i));
			   }//for
			 break;
		 case 2:
			 System.out.println("***Ascending Order***");
			 s.sort(new SortByModel());
			 s.forEach((fre)->
			 {
				 System.out.println(fre.toString());
			 });
			 System.out.println("****Descending Order****");
			   for(int i=s.size()-1;i>=0;i--)
			   {
				   System.out.println(s.get(i));
			   }//for
			 break;
		 case 3:
			 System.out.println("***Ascending Order***");
			   s.sort(new SortByPrice());
			   s.forEach((p)->
			   {
				   System.out.println(p.toString());
			   });
			   System.out.println("****Descending Order****");
			   for(int i=s.size()-1;i>=0;i--)
			   {
				   System.out.println(s.get(i));
			   }//for
			 break;
		  default:
			  System.out.println("Invalid choice....");
		 }//end of switch
		sc.close();
	}//main
}//class