package mk;

public class CommandLineArg {
	public static void main(String[] args) {
		CommandLineArg.main(111);
		CommandLineArg.main(1223.757f);
		System.out.println("===main(String[] args)===");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args.length);
	}

	public static void main(int i) {
		System.out.println("===main(int[] in)===");
		System.out.println("The Value i: " + i);
	}

	public static void main(float f) {
		System.out.println("===main(float[] f)===");
		System.out.println("The Value f: " + f);
	}
}//class