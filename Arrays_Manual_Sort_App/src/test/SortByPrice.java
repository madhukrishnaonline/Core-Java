package test;
import java.util.*;
public class SortByPrice implements Comparator<Object>
{
    public int compare(Object ob1,Object ob2)
    {
    	CarDetails c1 = (CarDetails)ob1;
    	CarDetails c2 = (CarDetails)ob2;
    	if(c1.cPrice==c2.cPrice) return 0;
    	else if(c1.cPrice>c2.cPrice) return 1;
    	else return -1;
    }//compare
}//class