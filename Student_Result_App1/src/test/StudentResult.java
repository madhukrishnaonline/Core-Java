package test;

public class StudentResult {
	public String generate(float per, boolean p) {
		if (p) {
			return "fail";
		} else if (per >= 80 || per <= 100) {
			return "Distinction";
		} else if (per >= 70 || per <= 100) {
			return "First Class";
		} else if (per >= 60 || per <= 100) {
			return "Second Class";
		} else if (per >= 50 || per <= 100) {
			return "Third Class";
		} else if (per >= 35 || per <= 100) {
			return "pass";
		} else {
			return "fail";
		}//else
	}//generate
}//class