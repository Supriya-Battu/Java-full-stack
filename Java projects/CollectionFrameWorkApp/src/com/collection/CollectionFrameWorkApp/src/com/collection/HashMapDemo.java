package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//Collection object 
		//HashMap hs = new HashMap();//we can't get how  u insert like that o/p doesn't come
		LinkedHashMap hs = new LinkedHashMap();//to see how u insert like that o/p come
		//Insert
		hs.put(1,10);
		hs.put("Second",20 );// u can't give duplicates if "second",30 then o/p will be 30 which is updated
		hs.put(true,"Priya");//values can be duplicates like if 4,"Priya" then that value also come as key is different
		hs.put(3,985364326);
		System.out.println(hs);
		System.out.println(hs.size());
		
		
	}

}
