package collection.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	
	//TreeMap stores the keys in the natural ordering i.e ascending order of the keys
	// To sort the keys it internally uses Comparable.compareTo(). Comparable is an interface all the wrapper classes internally provided implementation to this interface
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();	
	tm.put(1,"Sam");
	tm.put(4, "Joy");
	tm.put(2,"Tom");
	tm.put(3, "Bell");		
	System.out.println(tm);	//{1=Sam, 2=Tom, 3=Bell, 4=Joy}
	
	//To change the TreeMap behaviour. we can use single parameterized constructor. Here I am printing the keys and values in descending order of keys 
	
	TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>(new MyComparator());
	tm2.put(1,"Sam");
	tm2.put(4, "Joy");
	tm2.put(2,"Tom");
	tm2.put(3, "Bell");
	tm2.put(1,"Suri");
	System.out.println(tm2);  //{4=Joy, 3=Bell, 2=Tom, 1=Suri}	

	}
	
}


class MyComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
	Integer i1 = (Integer)o1;
	Integer i2 = (Integer)o2;
	return -(i1.compareTo(i2));	
	}
}
	
