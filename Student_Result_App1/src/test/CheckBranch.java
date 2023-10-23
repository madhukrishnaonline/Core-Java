package test;
public class CheckBranch {
   public boolean checkBranch(String br)
   {
	   return switch(br)
	   {
	   case "CSE":yield true;
	   case "EEE":yield true;
	   case "MECH": yield true;
	   case "ECE":yield true;
	   case "CIVIL":yield true;
	   default: yield
		   false;
	   };//switch case yield
   }//checkBranch
}//class