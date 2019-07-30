package sef.module9.sample;

import java.util.*;

public class CollectionsSample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//The collection is actually a List, but we are using a Collections
		//reference.  
		Collection c = new ArrayList();

		//to add a String element
		c.add("Hi Java!");
		c.add("Hello World!");

		//to remove a String element
		c.remove("Hi Java!");
		((ArrayList)c).remove(0); //<-- to remove element by index

		//Getting the size of the collection
		System.out.println(c.size());

	}
}
