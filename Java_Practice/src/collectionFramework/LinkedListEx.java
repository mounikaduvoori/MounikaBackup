package collectionFramework;
import java.util.*;  
public class LinkedListEx 
{
	 public static void main(String args[])
	 {  
	   
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("Mouni");//adding object in arraylist  
	  al.add("chinni");  
	  al.add("bujji");  
	  al.add("boochi");
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext())
	  {  
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


/*Java LinkedList class uses doubly linked list to store the elements. It extends the AbstractList class and implements List and Deque interfaces.
Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
Java LinkedList class can be used as list, stack or queue.
 */