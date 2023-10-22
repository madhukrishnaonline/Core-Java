package mk;
import java.util.*;
public class CollectionSet {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		HashSet<Character> hs = new HashSet<Character>();
		hs.add(new Character('m'));
		hs.add(new Character('a'));
		hs.add(new Character('d'));
		hs.add(new Character('h'));
		hs.add(new Character('u'));
		System.out.println("====hs====");
	    System.out.println(hs.toString());
	    HashSet<Character> hs1 = new HashSet<Character>();
		hs1.add(new Character('k'));
		hs1.add(new Character('r'));
		hs1.add(new Character('i'));
		hs1.add(new Character('s'));
		hs1.add(new Character('h'));
		System.out.println("====hs1====");
	    System.out.println(hs1.toString());
	    System.out.println("====addAll====");
	    System.out.println(hs1.addAll(hs));
	    System.out.println(hs1);
	    System.out.println("====removeAll====");
	    System.out.println(hs1.removeAll(hs));
	    System.out.println(hs1);
	    HashSet<Character> hs2 = new HashSet<Character>();
		hs2.add(new Character('n'));
		hs2.add(new Character('a'));
		hs2.add(new Character('k'));
		hs2.add(new Character('u'));
		hs2.add(new Character('m'));
		System.out.println("====hs2====");
	    System.out.println(hs2.toString());
	    System.out.println("====retainAll====");
	    System.out.println(hs2.retainAll(hs1));
	    System.out.println("Common Element b/w hs2 & hs1: "+hs2.toString());
	    HashSet<Character> hs3 = new HashSet<Character>();
		hs3.add(new Character('m'));
		hs3.add(new Character('m'));
		hs3.add(new Character('a'));
		System.out.println("====hs3====");
	    System.out.println(hs3.toString());
	    System.out.println("====Contains(Object)====");
	    System.out.println(hs3.contains(new Character('m')));
	    System.out.println("====ContainsAll(Collection<E>)====");
	    System.out.println(hs.containsAll(hs3));
	}//main
}//class