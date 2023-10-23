package test;
public class GenerateBranch {
   public String generate(String code) {
	   return switch(code) {
	   case "01":yield "CIVIL";
	   case "02":yield "EEE";
	   case "03":yield "MECH";
	   case "04":yield "ECE";
	   case "05":yield "CSE";
	   default: yield null;
	   };//switch case yield
   }//generate
}//class