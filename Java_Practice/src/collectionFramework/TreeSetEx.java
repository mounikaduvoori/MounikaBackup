package collectionFramework;
import java.util.*;  
	public class TreeSetEx 
	{ 
	 public static void main(String args[]){  
	   
	  TreeSet<String> al=new TreeSet<String>();  
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
	boochi
	bujji
	chinni  */
	
/*contains unique elements only like HashSet. The TreeSet class implements NavigableSet 
 * interface that extends the SortedSet interface.
 maintains ascending order. */