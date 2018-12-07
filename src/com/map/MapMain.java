package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		
		Map<String, String> languages = new HashMap<>();
		System.out.println(languages.put("Java", "Java description"));
		System.out.println(languages.put("Python", "Python description"));
		System.out.println(languages.put("Algol", "Algol description"));
		System.out.println(languages.put("BASIC", "BASIC description"));
		System.out.println(languages.put("Lisp", "Lisp description"));
		System.out.println(languages.put("Java", "Java description 2"));
		
		System.out.print("\n");
		
		System.out.println(languages.get("Java"));
		System.out.println("Contains Java: " + languages.containsKey("Java"));
		
		System.out.print("\n");
		
		for(String key : languages.keySet()) {
			System.out.println(key + ": " + languages.get(key));
		}
		
	}
	
}
