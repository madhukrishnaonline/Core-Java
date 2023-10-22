package mk;
import test.*;
import java.util.*;
public class ListSort {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add(new String("Madhu"));
		al.add(new String("Krishna"));
		al.add(new String("Oracle"));
		al.add(new String("Kummari"));
		al.add(new String("Java"));
		System.out.println("****forEach****");
		al.forEach((fe)->
		{
			System.out.println(fe.toString());
		});
		System.out.println("****After Sorting****");
		Collections.sort(al);
		for(String s:al)
		{
			System.out.println(s.toString());
		}//for
		System.out.println("****Descending Order****");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}//for
		System.out.println("****Product Details****");
		ArrayList<Product> pr = new ArrayList<Product>();
		pr.add(new Product("Jacket","987454",2,1500));
		pr.add(new Product("Mouse", "987456",3,1500));
		pr.add(new Product("Shoes", "987455",1,999));
		pr.add(new Product("Pants", "987458",3,3000));
		pr.add(new Product("Hoodie","987457",2,4000));
		System.out.println("****Listiterator****");
		ListIterator<Product> li = pr.listIterator();
		System.out.println("=====Forward Direction=====");
		while (li.hasNext()) {
			System.out.println(li.next());
		}//while
		System.out.println("=====BackWard Direction=====");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}//while
		pr.forEach((fr)->
		{
			System.out.println(fr.toString());
		});
		Collections.sort(pr);
		System.out.println("====After Sorting Process====");
		for(Product p:pr)
		{
			System.out.println(p.toString());
		}//for
		System.out.println("=====Descending Order=====");
		for(int i=pr.size()-1;i>=0;i--)
		{
			System.out.println(pr.get(i));
		}//for
	}//main
}//class