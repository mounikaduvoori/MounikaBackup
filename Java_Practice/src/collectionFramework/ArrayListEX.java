package collectionFramework;
import java.util.*;
//-----------------Example of Java ArrayList class---------------
public class ArrayListEX 
{
	public static void main(String args[]){  	
	ArrayList<String> al=new ArrayList<String>();//creating arraylist  
	  al.add("Mouni");//adding object in arraylist  
	  al.add("chinni");  
	  al.add("bujji");  
	  al.add("boochi");  
	  
	  /*System.out.println(al);
	  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
}
/*OUTPUT:
[Mouni, chinni, bujji, boochi]
Mouni
chinni
bujji
boochi
   */
//-----------------------------------------------------------------------------
/*------------------Iterating the elements of Collection by for-each loop------------
  for(String obj:al)  
    System.out.println(obj);  
 }  
}   */
//-----------------------------------------------------------------------   
/*  -------Example of addAll(Collection c) method-------------
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Reddy");  
  al2.add("Duvoori");  
    
  al.addAll(al2);    
  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
//Output:
Mouni
chinni
bujji
boochi
Reddy
Duvoori
*/
//----------------------------------------------------------------
//-----------Example of removeAll() method-------------------
/*ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Hello");  
	  al2.add("hi");  
	    
	  al.removeAll(al2);   
	  System.out.println("iterating the elements after removing the elements of al2...");  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }   }  }  
/*output:
iterating the elements after removing the elements of al2...
Mouni
chinni
bujji
boochi */
//----------------------------------------------------------------------------------
//------------Example of retainAll() method------------------------  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("MouniReddy");  
	  al2.add("chinni");  
	  
	  al.retainAll(al2);  
	  
	  System.out.println("iterating the elements after retaining the elements of al2...");  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
}  }  }
/*Output:
iterating the elements after retaining the elements of al2...
chinni
*/