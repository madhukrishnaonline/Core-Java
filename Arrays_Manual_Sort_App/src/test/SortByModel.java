package test;
import java.util.*;
public class SortByModel implements Comparator<Object>
{
	@Override
   public int compare(Object ob1,Object ob2)
   {
	   CarDetails cd1 = (CarDetails)ob1;
	   CarDetails cd2 = (CarDetails)ob2;
	   int m = cd1.cModel.compareTo(cd2.cModel);
	   if(m==0) return 0;
	   else if(m>1) return 1;
	   else return -1;
   }//compare
}//class