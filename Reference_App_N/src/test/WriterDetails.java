package test;
public class WriterDetails extends WriterContact //Converting ref to inheritance
{
   public String wName,addr,hNo;
   //public WriterContact wc = new WriterContact();
   public String toString()
   {
	   return "wName: "+wName+"\nAddress: "+addr+"\nH-No: "+hNo+"mailId: "+mailId+"\nPhoneNo.: "+phoneNo;
   }
}//class