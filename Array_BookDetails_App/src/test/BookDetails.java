package test;
public class BookDetails implements Comparable<Object>
{
   public String bkName,pName,author;
   public int price;
   
   public BookDetails(String bkName,String pName,String author,int price)
   {
	 this.bkName=bkName;
	 this.pName=pName;
	 this.author=author;
	 this.price=price;
   }//constructor
   
   @Override
   public String toString() 
   {
	   return bkName+"\t"+pName+"\t"+author+"\t"+price;
   }
   
   public int compareTo(Object o)
   {
	   BookDetails bk = (BookDetails)o;
	   int i = bkName.compareTo(bk.bkName);
	   if(i==0) return 0;
	   else if(i>0) return 1;
	   else return -1;
   }//compareTo
}//class