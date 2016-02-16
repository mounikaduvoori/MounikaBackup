package collectionFramework;

import java.util.*;  
public class LinkedHashSetEx 
{
	
	 public static void main(String args[]){  
	   
	  LinkedHashSet<String> al=new LinkedHashSet<String>();  
	  al.add("Mouni");//adding object in arraylist  
	  al.add("chinni");  
	  al.add("bujji");  
	  al.add("boochi");
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }    
}
/*Output:
Mouni
chinni
bujji
boochi
*/

/*contains unique elements only like HashSet. It extends HashSet class and 
 implements Set interface.
 maintains insertion order.
 */
