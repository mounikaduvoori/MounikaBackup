package collectionFramework;

public class ArrayListTheory {

}
/*Java ArrayList class uses a dynamic array for storing the elements.
> It extends AbstractList class and implements List interface.
> Java ArrayList class can contain duplicate elements.
> Java ArrayList class maintains insertion order.
> Java ArrayList class is non synchronized.
> Java ArrayList allows random access because array works at the index basis.
> In Java ArrayList class, manipulation is slow because a lot of shifting needs to
      be occurred if any element is removed from the array list.
      
-------------------------------------------------------------------   
>Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.

Java new generic collection allows you to have only one type of object in collection.
 Now it is type safe so typecasting is not required at run time.

Let's see the old non-generic example of creating java collection.

ArrayList al=new ArrayList();//creating old non-generic arraylist  
Let's see the new generic example of creating java collection.

ArrayList<String> al=new ArrayList<String>();//creating new generic arraylist  
In generic collection, we specify the type in angular braces. Now ArrayList is forced 
to have only specified type of objects in it. If you try to add another type of object, 
it gives compile time error.\
-----------------------------------------------------------------------------
>>>>>>Two ways to iterate the elements of collection in java
------------------------------------------------------------

By Iterator interface.
By for-each loop.
In the above example, we have seen traversing ArrayList by Iterator.
 Let's see the example to traverse ArrayList elements using for-each loop

*/