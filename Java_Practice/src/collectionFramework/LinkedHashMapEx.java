package collectionFramework;
import java.util.*; 

public class LinkedHashMapEx {  
	 public static void main(String args[]){  
	   
	  LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
	  
	  lhm.put(100,"A");  
	  lhm.put(101,"B");  
	  lhm.put(102,"C");  
	  
	for(Map.Entry m:lhm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }    
}
/*Output:
100 A
101 B
102 C
*/

/*Java LinkedHashMap class:
  ------------------------
A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It is same as HashMap instead maintains insertion order.  */