package collectionFramework;
import java.util.*; 
public class HashMapEx 
{
	 public static void main(String args[]){  
	   
	  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
	  
	  hm.put(100,"A");  
	  hm.put(101,"B");  
	  hm.put(102,"C");  
	  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
}
/*OUTPUT: 
102 C
100 A
101 B
*/

/*A HashMap contains values based on the key. It implements the Map interface and 
 extends AbstractMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order. */
//NOTE:HashSet contains only values whereas HashMap contains entry(key and value)
//-----