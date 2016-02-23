package oopsPrograms;

public class InheritanceExEmployee
{ 
  float salary=40000;  
}  
		class Programmer extends InheritanceExEmployee
		 {  
		 int bonus=10000;  
		 public static void main(String args[])
		 {  
		   Programmer p=new Programmer();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);  
		}   
}
	 
/*Output:Programmer salary is:40000.0
		 Bonus of Programmer is:10000*/
		
		
/* Inheritance in java is a mechanism in which one object acquires all the properties
 and behaviors of parent object.
The idea behind inheritance in java is that you can create new classes that are built 
upon existing classes. When you inherit from an existing class, you can reuse methods 
and fields of parent class, and you can add new methods and fields also.
Inheritance represents the IS-A relationship, also known as parent-child relationship.
We are using 
1.For Method Overriding (so runtime polymorphism can be achieved).
2.For Code Reusability.*/
		
/*Programmer is the subclass and Employee is the superclass. Relationship between 
 * two classes is Programmer IS-A Employee.It means that Programmer is a type of 
 * Employee.
 */ 
		