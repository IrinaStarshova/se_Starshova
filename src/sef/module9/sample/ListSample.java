package sef.module9.sample;

import java.util.*;

public class ListSample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// Create the list
	    List list = new LinkedList();    // Doubly-linked list
	    list = new ArrayList();          // List implemented as growable array
	    
	    // Append an element to the list
	    list.add("a");
	    
	    // Insert an element at the head of the list
	    list.add(0, "b");
	    
	    // Get the number of elements in the list
	    @SuppressWarnings("unused")
		int size = list.size();          // 2
	    
	    // Retrieving the element at the end of the list
	    @SuppressWarnings("unused")
		Object element = list.get(list.size()-1);   // a
	    
	    // Retrieving the element at the head of the list
	    element = list.get(0);                      // b
	    
	    // Remove the first occurrence of an element
	    @SuppressWarnings("unused")
		boolean b = list.remove("b");      // true
	    b = list.remove("b");              // false
	    
	    // Remove the element at a particular index
	    element = list.remove(0);          // a

		

	}

}
