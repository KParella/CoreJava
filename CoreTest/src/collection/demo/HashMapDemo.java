package collection.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		
	//HashMap internal structure key-value pairs and uses Hashtable.
	//Duplicate keys are not allowed but values are allowed. 

	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(1,"Sam");
	hm.put(4,"Joy");
	hm.put(2,"Tom");
	hm.put(3,"Bell");
	

	//toString() in both HashMap and Wrapper classes are overridden
	// So we can print them off using ref variable without iterating 
	
	System.out.println(hm);  //{1=Sam, 2=Tom, 3=Bell, 4=Joy}
	
	//Getting the Map.Entry objs. in the form of Set obj.
	Set s = hm.entrySet();
	//Iterating the set obj. using iterator 
	Iterator itr = s.iterator();
	while(itr.hasNext()){
		Object o = itr.next();
		//TypeCasting the obj type to Map.Entry type Explicit TypeCasting 
		Map.Entry me = (Map.Entry)o;
		Integer i =(Integer) me.getKey();
		if(i==2)
		//Changing the value of a key-value pair
		me.setValue("sweety");		
	}
	//The changes are reflected in the HashMap 
	System.out.println(hm);  //{1=Sam, 2=sweety, 3=Bell, 4=Joy}
	
	//Getting the keys from HashMap 
	Set s2 = hm.keySet();
	Iterator it = s2.iterator();
	while(it.hasNext()){
		Integer i = (Integer)it.next();
		if(i==2) 
			//Removing an element from Iterator 
			it.remove(); 
	}
	//changes are reflected in HashMap
	System.out.println(hm);  //{1=Sam, 3=Bell, 4=Joy}
	hm.put(3,"sweety");
	System.out.println(hm);  //{1=Sam, 3=sweety, 4=Joy}
	hm.put(1,"sweety");
	// when we enter new entry with the existing key, value will be replaced 
	System.out.println(hm);  //{1=sweety, 3=sweety, 4=Joy}
	
	//created a new HashMap hm2
	HashMap hm2 = new HashMap();
	hm2.put(1,"Kir");
	hm2.put(2,"Bill");
	
	//created new HashMap hm3 and added the hm HashMap to it. 
	// hm3 is not type safe(not a generic type). 
	HashMap hm3 = new HashMap();
	hm3.putAll(hm);
	
	//Added hm2 to hm3
	hm3.put(2, hm2);
	System.out.println(hm3); //{1=sweety, 2={1=Kir, 2=Bill}, 3=sweety, 4=Joy}
	
	//printing hm3 second element value that is hm2, then printing 2nd element from hm2 i.e, Bill
	System.out.println(((HashMap)hm3.get(2)).get(2));//Bill
	
	//Getting only values 
	Collection c = hm3.values();
	
	//printing only values 
	System.out.println(c); // [sweety, {1=Kir, 2=Bill}, sweety, Joy]
		
	
}
	}
