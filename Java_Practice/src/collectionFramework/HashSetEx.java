package collectionFramework;
import java.util.*;  
	public class HashSetEx
	{
	 public static void main(String args[]){  
	   
	  HashSet<String> al=new HashSet<String>();  
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
	bujji
	boochi
	chinni
	Mouni
*/
/*>>>uses hashtable to store the elements.It extends AbstractSet class and implements 
     Set interface.
 >>>contains unique elements only.
 >>>>>>>>>>>List can contain duplicate elements whereas Set contains unique elements only.*/