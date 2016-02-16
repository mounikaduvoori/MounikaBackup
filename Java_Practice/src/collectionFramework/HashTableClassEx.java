package collectionFramework;
import java.util.*;  

public class HashTableClassEx
	{
	 public static void main(String args[]){  
	   
	  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"A");  
	  hm.put(102,"B");  
	  hm.put(101,"C");  
	  hm.put(103,"D");  
	  hm.put(101,"E");  
	  hm.put(104,"F"); 
	  hm.put(105,"D");
	  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }    
}
/*OUTPUT:
105 D
104 F
103 D
102 B
101 E
100 A
*/
//------------------------------------------------------------------------------------------
/*Java Hashtable class:
  -------------------
A Hashtable is an array of list.Each list is known as a bucket.The position of bucket is identified by calling the hashcode() method.A Hashtable contains values based on the key. It implements the Map interface and extends Dictionary class.
It contains only unique elements.
It may have not have any null key or value.
It is synchronized. 
*/