package collection.demo;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	//WeakHashMap is same as HashMap but in case of WeakHashMap, GarbageCollector will dominates WeakHashMap 

	public static void main(String[] args) {
		
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
		Integer i = new Integer(10);	
		hm.put(i,"Bell");
		i=null;
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		System.out.println("In case of HashMap:"+hm);  //In case of HashMap:{10=Bell}
		
	WeakHashMap<Integer,String> whm = new WeakHashMap<Integer,String>();
		i=new Integer(10);
		whm.put(i,"Bell");
		i=null;
		rt.gc();
		System.out.println("In case of WeakHashMap:"+whm);   //In case of WeakHashMap:{}
	}

}
