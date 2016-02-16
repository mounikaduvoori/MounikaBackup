package collectionFramework;
	import java.util.*;  
	
public class TreeMapEx
	{
	 public static void main(String args[]){  
	   
	  TreeMap<Integer,String> tm=new TreeMap<Integer,String>();  
	  
	  tm.put(100,"A");  
	  tm.put(101,"B");  
	  tm.put(103,"C");  
	  tm.put(102,"D"); 
	  tm.put(104,"E"); 
	  tm.put(102,"F"); 
	  for(Map.Entry m:tm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }   
}
/*output:
100 A
101 B
102 F
103 C
104 E
*/
//------------------------------------------------------------------------------
/* A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
It contains only unique elements.
It cannot have null key but can have multiple null values.
It is same as HashMap instead maintains ascending order. */
//-------------------------------------------------------------------------------
/*   HashMap                                        TreeMap
1) HashMap is can contain one null key. 	1.TreeMap can not contain any null key.
2) HashMap maintains no order.              2.TreeMap maintains ascending order  */