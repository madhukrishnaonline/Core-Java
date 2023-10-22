package mk;
import java.util.*;
import test.BookDetails;
public class MultipleBookDetails {
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   try(sc;)
	   {
		   try
		   {
			   System.out.println("Enter the Size of Array:");
			   Integer size = new Integer(Integer.parseInt(sc.nextLine()));
			   BookDetails bk[]= new BookDetails[size];
			   System.out.println("Enter the "+size+" BookDetails:");
			   for(int i=0;i<=bk.length-1;i++)
			   {			
				   System.out.println("Enter the BookName:");
				   String bkName = new String(sc.nextLine());
				   System.out.println("Enter the Publisher Name:");
				   String pName = new String(sc.nextLine());
				   System.out.println("Enter the Author name:");
				   String author = new String(sc.nextLine());
				   System.out.println("Enter the Price:");
				   Integer price = new Integer(Integer.parseInt(sc.nextLine()));
				   bk[i]=new BookDetails(bkName,pName,author,price);
			   }//for
			   Spliterator<BookDetails> sp = Arrays.spliterator(bk);
			   System.out.println("===Spliterator===");
			   sp.forEachRemaining((f)->
			   {
				   System.out.println(f.toString());
			   });
			   System.out.println("===Displaying in Ascending Order===");
			   Arrays.sort(bk);
			   System.out.println("===Spliterator===");
			   Spliterator<BookDetails> sp1 = Arrays.spliterator(bk);
			   sp1.forEachRemaining((s)->
			   {
				   System.out.println(s.toString());
			   });
			   System.out.println("===Arrays.sort===");
			   Arrays.sort(bk);
			   for(BookDetails bd:bk)
			   {
				   System.out.println(bd.toString());
			   }//for
		   }//end of try
		   catch(Exception ex)
		   {
			   //System.out.println("Enter Integer Values Only...");
			   ex.printStackTrace();
		   }//catch
	   }//end of try-with-resource
	}//main
}//class