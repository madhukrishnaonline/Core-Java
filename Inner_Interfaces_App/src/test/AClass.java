package test;

public abstract class AClass {
	public abstract void abs(double d);

	public interface AInterf {
		void AA(boolean b);
	}//non-static inner interface

	public static interface ASInterf {
		void AAA(char ch);
	}//static inner interface
}//abstract class