package sef.module15.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EnhancedForLoop {

	public static void main(String[] args) {

		int[] sqr = { 0, 1, 4, 9, 16, 25 };
		for (int i : sqr) {
			System.out.println(i);
		}

		List<String> names = new ArrayList<String>();
		names.add("John Doe");
		names.add("Jane Doe");
		
//		//Can remove element
		for (ListIterator<String> iter = names.listIterator(); iter.hasNext() && iter.hasPrevious(); ) {
			String elem = iter.next();
			String previous = iter.previous();
			System.out.println(elem);
			System.out.println(previous);
		}
		
		//Can't remove element
		for (String i : names) {
			System.out.println(i);
			names.remove(i);
		}

	}
}
