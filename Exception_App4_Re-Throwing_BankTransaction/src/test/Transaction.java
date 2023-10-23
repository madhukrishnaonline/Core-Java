package test;

public interface Transaction {
	void process(int amt) throws WithDraw;

	Balance b = new Balance();
}//class