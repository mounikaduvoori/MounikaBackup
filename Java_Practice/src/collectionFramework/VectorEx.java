package collectionFramework;
	import java.util.*;    
//ArrayList and Vector both implements List interface and maintains insertion order.	
public class VectorEx
	{
  
	 public static void main(String args[]){      
	  Vector<String> v=new Vector<String>();//creating vector  
	  v.add("A");//method of Collection  
	  v.addElement("B");//method of Vector  
	  v.addElement("C");  
	  //traversing elements using Enumeration  
	  Enumeration e=v.elements();  
	  while(e.hasMoreElements()){  
	   System.out.println(e.nextElement());  
	  }  
	 }      
}
/*Output:
A
B
C
*/