package collectionFramework;
import java.util.*;  
//The PriorityQueue class provides the facility of using queue. But it does not orders
//the elements in FIFO manner.
public class PriorityQueueEx
	{ 
	public static void main(String args[]){  
	  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("A");  
	queue.add("B");  
	queue.add("C");  
	queue.add("D");  
	queue.add("E");  
	  
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	  
	System.out.println("iterating the queue elements:");  
	Iterator itr=queue.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	  
	queue.remove();  
	queue.poll();  
	  
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  
	}  	  
	}   
}
/*Output:
head:A
head:A
iterating the queue elements:
A
B
C
D
E
after removing two elements:
C
D
E
*/
/*Methods of Queue Interface :
-----------------------------
public boolean add(object);
public boolean offer(object);
public remove();
public poll();
public element();
public peek();
 */