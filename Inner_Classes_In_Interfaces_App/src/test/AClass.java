package test;

public abstract class AClass {
	public abstract void kk();

	public class AInClass {
		public void AA() {
			System.out.println("===InnerClass AA()===");
		}
	}// innerClass Instance

	public static class AInSClass {
		public static void AAA() {
			System.out.println("===InnerClass AAA()===");
		}
	}// InnerClass Static
}// OuterAbstractClass