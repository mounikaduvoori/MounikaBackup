package collectionFramework;
import java.util.*; 

	public class SortingEx 
	{
	public static void main(String args[]){  
	  
	ArrayList<String> al=new ArrayList<String>();  
	  al.add("Mouni");//adding object in arraylist  
	  al.add("chinni");  
	  al.add("bujji");  
	  al.add("boochi");  
	  al.add("X");  
	  al.add("A");  
	  al.add("M");  
	Collections.sort(al);  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }  
	}  
}
/*Output:
	A
	M
	Mouni
	X
	boochi
	bujji
	chinni
*/
/*Sorting:
---------
We can sort the elements of:
---------------------------
String objects
Wrapper class objects
User-defined class objects
Collections class provides static methods for sorting the elements of collection.
If collection elements are of Set type, we can use TreeSet.But We cannot sort the elements of List.Collections class provides methods for sorting the elements of List type elements.
Method of Collections class for sorting List elements

public void sort(List list): is used to sort the elements of List.List elements must be
 of Comparable type.
Note: String class and Wrapper classes implements the Comparable interface.
So if you store the objects of string or wrapper classes, it will be Comparable. */