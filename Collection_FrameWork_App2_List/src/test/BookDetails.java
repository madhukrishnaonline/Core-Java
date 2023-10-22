package test;

//import java.util.*;
public class BookDetails {
	public String bkName, publisher, author;
	public double price;

	// public Date dateTime;
	public BookDetails(String bkName, String publisher, String author, double price) {
		this.bkName = bkName;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		// this.dateTime=dateTime;
	}

	public String toString() {
		return bkName + "\t" + publisher + "\t" + author + "\t" + price;
	}
	/*
	 * public int compareTo() {
	 * 
	 * return 1; }
	 */
}// class