package main;

import test.Connection;
import test.DriverManager;

public class Lambda {
	public static void main(String[] args) {
		Connection con = DriverManager.getConnection("bhbdfjkg", "java", "java");
		con.connection();
	}//main
}//class