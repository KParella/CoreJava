package collection.demo;

import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Map;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		//Whatever operations we did with HashMap we can do with LinkedHashMap as it is a subclass of HashMap
		//Recommend to go throw the HashMapDemo application before going throw this application. Thanks 
		
		//Internal structure is Hashtable and Doubly Linked List. 
		//saves the key-value pairs on the order of insertion. 

		//Not a best practice to keep the intial capacity low. But just for checking 
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(3, 25);
		lhm.put(1,"Sam");
		lhm.put(2,"Tom");
		lhm.put(4,"Bell");
		lhm.put(3,"Joy");	
		
		//saves the key-value pairs on the order of insertion.
		System.out.println(lhm); //{1=Sam, 2=Tom, 4=Bell, 3=Joy}
		
		//To get the synchronized(Thread safe) LinkedHashMap we have a method in Collections class
		
		Map m = Collections.synchronizedMap(lhm);
		
		System.out.println(m.containsKey("5")); //false
		System.out.println(m.containsValue("Tom")); //true
		
		
		
		
		
		
	
		
		

	}

	

}
