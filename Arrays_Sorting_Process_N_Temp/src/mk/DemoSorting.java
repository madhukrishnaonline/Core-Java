package mk;
import java.util.*;
import test.*;
public class DemoSorting {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 try(sc;)
	 {
		 try
		 {
			 System.out.println("Enter the size of an Array:");
			 Integer size = new Integer(Integer.parseInt(sc.nextLine()));
			 Product[] p = new Product[size];
			 System.out.println("Enter "+size+" Objects to hold:");
			 for(Integer n=0;n<=size-1;n++)
			 {
				 p[n] = new Product();
				 System.out.println("Enter ProductId:");
				 p[n].pId = Integer.parseInt(sc.nextLine());
				 System.out.println("Enter Product Name:");
				 p[n].pName = sc.nextLine();
				 System.out.println("Enter price:");
				 p[n].price = Float.parseFloat(sc.nextLine());
				 System.out.println("Enter product qty:");
				 p[n].qty = Integer.parseInt(sc.nextLine());
			 }//end of loop
			 System.out.println("****Spliterator****");
			 System.out.println("***Product Details***");
			 Spliterator<Product> sp = Arrays.spliterator(p);
			 sp.forEachRemaining((f)->
			 {
				 System.out.println(f.toString());
			 });
			 System.out.println("====After Sorting====");
		     Arrays.sort(p);
		     for(Product r:p)
		     {
		    	 System.out.println(r.toString());
		     }//for
		     System.out.println("====Descending Order====");
		     for(int n=size-1;n>=0;n--)
		     {
		    	 System.out.println(p[n].toString());
		     }//for
		 }//end of try
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }//catch
	 }//end of try with resource
	}//main
}//class