package mk;

import java.util.*;

public class DemoJoiner 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("===Emp Date of Joining===");
		StringJoiner sj1 = new StringJoiner("/");
		sj1.setEmptyValue("no details available...");
		System.out.println(sj1.toString());// displaying empty object
		System.out.println("Enter the Date:");
		sj1.add(s.nextLine());
		System.out.println("Enter the month:");
		sj1.add(s.nextLine());
		System.out.println("Enter the Year:");
		sj1.add(s.nextLine());
		System.out.println("DOJ :" + sj1.toString());// displaying with data
		System.out.println("===Emp Address===");
		StringJoiner sj2 = new StringJoiner("-");
		sj2.setEmptyValue("No Address Available...");
		System.out.println("Enter the City:");
		sj2.add(s.nextLine());
		System.out.println("Enter the mailId:");
		sj2.add(s.nextLine());
		System.out.println("Enter the phNo:");
		sj2.add(s.nextLine());
		System.out.println("Address:" + sj2.toString());
		sj1.merge(sj2);// merging two objects
		System.out.println("===After Merging===");
		System.out.println(sj1.toString());
		System.out.println("length:" + sj1.length());
		s.close();
	}// main
}// class