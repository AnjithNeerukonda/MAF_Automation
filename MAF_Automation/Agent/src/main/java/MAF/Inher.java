package MAF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class Inher {

	public void set() {

		HashSet set = new HashSet();
		set.add("Anjith");
		set.add("Anil");
		set.add("satish");
		set.add("Anjith");
		set.add("Anjith");

		ArrayList li = new ArrayList(set);
		li.addAll(set);
		li.add("list1");

		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println("set=" + itr.next());
		}

	}

	public void list() {
		List li = new ArrayList();
		li.add("Anjith");
		li.add("Anjith");
		li.add("Anil");
		li.add("siva");

		List li2 = new ArrayList();
		li2.add("Agent1");
		String s1 = new String("Agent2");
		li2.add(s1);
		List li3 = new ArrayList();
		li3.add("AAA12");
		li.addAll(li2);
		li.addAll(1, li3);

//		for(int i = 0;i<li.size();i++) {
//			
//			System.out.println("list"+li.get(i));
//		}
		Iterator itr = li.iterator();
		while (itr.hasNext()) {

			System.out.println("list=" + itr.next());
		}

	}

	public void map() {

		Map mi = new HashMap();
		mi.put(1, "Anjith");
		mi.put(6, "siva");
		Set set = mi.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	public void list1() {
		try {
			List li = new ArrayList();
			li.add("Anjith");
			li.add("siva");
			li.add("naveen");
			li.add("5");
			System.out.println(li);
			ListIterator list1 = li.listIterator(li.size());
			while (list1.hasPrevious()) {
				String str = (String) list1.previous();
				System.out.println(str);

			}

		} catch (NoSuchElementException e) {

			System.out.print("");

		}

	}

	public void strig() {

	}

//		String s="Anjith";
//		
//		for(int i=0;i<=s.length()-1;i++) {
//			
//		System.out.println(s);
//		
//		}
//		

	public static void main(String args[]) {
		Inher he = new Inher();
//		       he.set();
//		       he.list();
//			he.map();
//			he.list1();
		he.strig();
	}

}
