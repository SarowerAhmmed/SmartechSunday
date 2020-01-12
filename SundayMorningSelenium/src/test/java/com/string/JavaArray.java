package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaArray {

	public static void main(String[] args) {

		Map<String, Integer> mymap = new LinkedHashMap<>();
		mymap.put("salary3", 5000);
		mymap.put("salary2", 6000);
		//mymap.put(null, 5000);
		//mymap.put(null, 6000);
		//System.out.println(mymap);
		//System.out.println(mymap.entrySet());
		//System.out.println(mymap.size());
		
//		System.out.println(mymap.get("salary2"));
//		System.out.println(mymap.get("salary3"));
//		System.out.println(mymap.keySet());
//		System.out.println(mymap.values());
		
	mymap.forEach((k,v) ->
	{
		System.out.println(k +" = " +v);
	}
			
			);
		
		//mymap.forEach((k,v)->System.out.println("Key: " + k + "Value: " + v));
		
	}
	

}
