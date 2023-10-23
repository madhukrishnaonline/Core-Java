package mk;

@SuppressWarnings("serial")
public class DemoNullException extends NullPointerException {
	static String str;

	public static void main(String[] args) {
		System.out.println("String Data: " + str.toString());
	}
}//class