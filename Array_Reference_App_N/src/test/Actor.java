package test;
public class Actor extends Object 
{
  public String aName,addr,hNo;
  public double remun;
  public Contact ob;
  
  public Actor(Contact ob)
  {
	  this.ob=ob;
  }
  
  @Override
  public String toString()
  {
	  return "ActorName: "+aName+"\nAddress: "+addr+"\nH/No: "+hNo+"\nMailId: "+ob.mailId+"\nPhoneNo: "+ob.phoneNo+"\nRemuneration: "+remun;
  }//toString
}//class