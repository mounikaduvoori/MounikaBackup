package oopsPrograms;

public class DynamicBindingAnimalEx 
     {  
		 void eat()
		     {
			 System.out.println("animal is eating...");
			 }  
	}  	  
class Cat extends DynamicBindingAnimalEx 
		{  
		 void eat()
		     {
			 System.out.println("Cat is eating...");
			 }  
  public static void main(String args[])
  {  
	 DynamicBindingAnimalEx  a=new Cat();  
		 a.eat();  
  }  		  
}
  //Output:Cat is eating...

/*In the above example object type cannot be determined by the compiler, because 
 * the instance of Dog is also an instance of Animal.So compiler doesn't know its 
 * type, only its base type. */
