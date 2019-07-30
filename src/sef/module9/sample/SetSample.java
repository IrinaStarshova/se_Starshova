package sef.module9.sample;

import java.util.*;

public class SetSample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Set monthSet = new HashSet();

		//duplicates will return false
		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("February"));
		System.out.println(monthSet.add("February")); 
		System.out.println(monthSet.add("March"));
		System.out.println(monthSet.add("January"));

		System.out.println("Output : ");

		for(Object month : monthSet) 
			System.out.println(month + ", ");
	}
}
