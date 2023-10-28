package test;

public class DriverManager {
	public static Connection getConnection(String url, String uname, String pswd) {
		return () -> {
			System.out.println("Connection Established Successfully....");
		};
	}//getConnection
}//class