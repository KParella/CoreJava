package collection.demo;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		//Hashtable is a legacy synchronized class 
		//It sort the keys on the bases of hashcode generated by the JVM
		//It internally uses hashCode() and equals() to sort the keys. Almost all the wrapper classes override hashCode() and equals()  from Object class   

		KOne k1 = new KOne();
		KOne k2 =new KOne();
		//Here I can't make this Hashtable type safe by Generics. As we are inserting different types of Objs. 
		Hashtable ht = new Hashtable();
		ht.put(k1, "Sam");
		ht.put(k2, "Tom");
		ht.put(new String("str"),"Bell");
		// k1 and k2 are pointing to different objs in real. But we have overridden the hashCode() and equals() of KOne class. so the Hashtable treats them as duplicates 
		System.out.println(ht);   //{str=Bell, KOne=Tom}
		
		Enumeration e = ht.keys();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+"\t"); // str	KOne
		}
		
		Enumeration e1 = ht.elements();
		while(e1.hasMoreElements()){
			System.out.print(e1.nextElement()+"\t");  //Bell	Tom
		}			
	}
}



class KOne {
	
@Override	
public int hashCode(){
return 100;	
}

@Override
public boolean equals(Object o){
	return true;
}

@Override
public String toString(){
	return "KOne";
}
	
}	
