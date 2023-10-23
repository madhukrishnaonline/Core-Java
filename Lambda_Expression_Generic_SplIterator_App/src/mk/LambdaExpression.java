package mk;

import java.util.*;

public class LambdaExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				System.out.println("Enter the Size of array to hold String Objects:");
				int str = Integer.parseInt(sc.nextLine());
				String st[] = new String[str];
				System.out.println("Enter " + str + " Strin Objects:");
				for (int i = 0; i <= st.length - 1; i++) {
					st[i] = new String(sc.nextLine());
				}
				Spliterator<String> ob = Arrays.spliterator(st);
				// Implementation object of Spliterator Interface
				System.out.println("===SplIterator===");
				ob.forEachRemaining((k) -> {
					System.out.println(k);
				});
				sc.close();
			} // end of try
			catch (Exception ex) {
				System.out.println("Enter Only Integer Values...");
				ex.getMessage();
			}//catch
		} // end of try-with-resource
	}//main
}//class