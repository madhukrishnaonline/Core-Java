package mk;
public class CommandLine
{
	public static void main(String[] args)
	{
		System.out.println(args.length);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		for(String p:args)
		{
			System.out.println(p.toString());
		}
	}//main
}//class