package comk.girmiti.prct;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<String>();
		s.add("orange");
		s.add("banana");
		s.add("mango");
		s.add("apple");
		System.out.println(s);
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
