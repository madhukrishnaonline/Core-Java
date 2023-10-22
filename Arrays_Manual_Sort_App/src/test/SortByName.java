package test;
import java.util.*;
public class SortByName implements Comparator<Object>
{
  public int compare(Object ob1,Object ob2)
  {
	  CarDetails c1 = (CarDetails)ob1;
	  CarDetails c2 = (CarDetails)ob2;
	  int c = c1.cName.compareTo(c2.cName);
	  if(c==0) return 0;
	  else if(c>1) return 1;
	  else return -1;
  }//compare
}//class