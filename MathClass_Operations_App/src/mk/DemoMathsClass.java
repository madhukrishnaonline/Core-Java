package mk;

import static java.lang.Math.*;
import java.util.*;

public class DemoMathsClass {
	@SuppressWarnings("removal")
	public static void main(String[] AA) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****Operations On Math Class****");
		mk: while (true) {
			System.out.println("====Choice====");
			System.out.println("1.Sqrt\n2.Cbrt\n3.ceil\n4.floor\n5.Max\n6.Min\n7.rint\n8.random()\n9.exp()\n10.exit");
			System.out.println("Enter the Choice:");
			switch (new Integer(sc.nextInt())) {
			case 1:
				System.out.println("Operations On Sqrt Method");
				System.out.println("Enter the Value :");
				double val = new Double(sc.nextDouble());
				double r = sqrt(val);
				System.out.println("sqrt of " + val + " is: " + r);
				break;
			case 2:
				System.out.println("Operations On Cbrt Method");
				System.out.println("Enter the Value :");
				double val1 = new Double(sc.nextDouble());
				double r1 = cbrt(val1);
				System.out.println("cbrt of  " + val1 + " is: " + r1);
				break;
			case 3:
				System.out.println("Operations On ceil Method");
				System.out.println("Enter the Value :");
				double val2 = new Double(sc.nextDouble());
				double r2 = ceil(val2);
				System.out.println("Ceil of  " + val2 + " is: " + r2);
				break;
			case 4:
				System.out.println("Operations On floor Method");
				System.out.println("Enter the Value :");
				double val3 = sc.nextDouble();
				double r3 = floor(val3);
				System.out.println("floor of  " + val3 + " is: " + r3);
				break;
			case 5:
				System.out.println("Operations on Max Value Method");
				System.out.println("Enter the Value-1:");
				double val4 = new Double(sc.nextDouble());
				System.out.println("Enter the Value-2:");
				double val5 = new Double(sc.nextDouble());
				double r4 = max(val4, val5);
				System.out.println("The Maximum Value is: " + r4);
				break;
			case 6:
				System.out.println("Operations on Min Value Method");
				System.out.println("Enter the Value-1:");
				double val6 = new Double(sc.nextDouble());
				System.out.println("Enter the Value-2:");
				double val7 = new Double(sc.nextDouble());
				double r5 = min(val6, val7);
				System.out.println("The Minimum Value is: " + r5);
				break;
			case 7:
				System.out.println("Enter the Value:");
				Double val8 = new Double(sc.nextDouble());
				Double r6 = rint(val8);
				System.out.println("The rint of " + val8 + " is: " + r6);
				break;
			case 8:
				Double r7 = Math.random();
				System.out.println("Random " + r7);
				break;
			case 9:
				System.out.println("Enter the Value:");
				Double val9 = new Double(sc.nextDouble());
				Double r8 = exp(val9);
				System.out.println("Exponent of " + val9 + " is " + r8);
				break;
			case 10:
				System.out.println("Operations On Math Class has been Terminated...");
				break mk;
			default:
				System.out.println("Invalid Choice.....");
			}// end of switch
		} // end of loop
		sc.close();
	}//main
}//class