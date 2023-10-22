package test;
public class CarDetails 
{
   public String cName,cModel;
   public double cPrice;
   
   public CarDetails(String cName,String cModel,double cPrice)
   {
	   this.cName=cName;
	   this.cModel = cModel;
	   this.cPrice=cPrice;
   }
   
   @Override
   public String toString()
   {
	   return "cName: "+cName+"\ncModel: "+cModel+"\ncPrice: "+cPrice;
   }//toString
}//class