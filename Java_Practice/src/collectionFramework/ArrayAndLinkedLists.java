package collectionFramework;
//ArrayList and LinkedList both implements List interface and maintains 
//insertion order. Both are non synchronized classes.
import java.util.*; 
public class ArrayAndLinkedLists 
{   
	 public static void main(String args[]){    
	     
	  List<String> al=new ArrayList<String>();//creating arraylist    
	  al.add("Mouni");//adding object in arraylist  
	  al.add("chinni");  
	  al.add("bujji");  
	  al.add("boochi");   
	    
	  List<String> al2=new LinkedList<String>();//creating linkedlist    
	  al2.add("ram");//adding object in linkedlist    
	  al2.add("lakshman");    
	  al2.add("bharatha");    
	  al2.add("shatrugna");    
	    
	  System.out.println("arraylist: "+al);  
	  System.out.println("linkedlist: "+al2);  
	 }       
}
/*  Output:
arraylist: [Mouni, chinni, bujji, boochi]
linkedlist: [ram, lakshman, bharatha, shatrugna]  */

/*ArrayList:
 -----------	
1) ArrayList internally uses dynamic array to store the elements.	
2) Manipulation with ArrayList is slow because it internally uses array. 
If any element is removed from the array, all the bits are shifted in memory.	
3) ArrayList class can act as a list only because it implements List only.	
4) ArrayList is better for storing and accessing data.
LinkedList:
-----------
LinkedList
1)LinkedList internally uses doubly linked list to store the elements.
2)Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
3)LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) LinkedList is better for manipulating data.
*/