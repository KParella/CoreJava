package collection.demo;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

public class IdentityHashMapDemo {
	
	//IdentityHashMap is pretty much similar to HashMap, there it will sort or store the key-value pairs based on keys value
	//Here in IdentityHashMap there were stored or compared based on references of the key 

	public static void main(String[] args) {
	
	IdentityHashMap<Integer,String> ihm = new IdentityHashMap<Integer,String>();
	
	Integer i1 = 10;  //Auto-boxing
	Integer i2= new Integer("10");
	
	ihm.put(i1, "Sam");
	ihm.put(i2, "Tom");
	//As i1 and i2 are pointing to two different Integer objs they are considered as unique keys and inserted in IdentityHashMap
	System.out.println(ihm);  //{10=Sam, 10=Tom}
	
	Integer i3 = i2;
	ihm.put(i3, "Bell");
	//Here i3 and i2 are pointing to same obj. so they are considered as duplicate keys. 
	//so value is replaced for the previous key with the new value i.e Tom with Bell
	System.out.println(ihm); // {10=Sam, 10=Bell}
	
	//To check whether key is also replaced or just value 
	
	Set<Integer> s = ihm.keySet();
	Iterator<Integer> it = s.iterator();
	while(it.hasNext()){
		Integer i = (Integer)it.next();
		if(i==i2){
			System.out.println("key is not replaced!!");  //key is not replaced!! . so the conclusion is values are replaced but not keys. 
		}else if(i==i3){
			System.out.println("key is replaced");
		}
			
	}
		
		

	}

}
