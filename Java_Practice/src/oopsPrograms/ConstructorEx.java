package oopsPrograms;

public class ConstructorEx
{
	String surname;
	String name;
	
	ConstructorEx(String a,String b)
	{
		 surname=a;
		 name=b;	
	}
	  void consDisplay()
	{
		System.out.println(surname+" "+name);
	}
	 public static void main(String []args)
	 {
		 System.out.println("Example program for Constructor in java");
		 ConstructorEx ce=new ConstructorEx("Duvoori","MounikaReddy"); 
		 ce.consDisplay();
	 }
}

/*Output:
Example program for Constructor in java
Duvoori MounikaReddy
*/

/*Constructor in java is a special type of method that is used to initialize the object.
Java constructor is invoked at the time of object creation. It constructs the values
 i.e. provides data for the object that is why it is known as constructor.*/

/* There are basically two rules defined for the constructor.
1.Constructor name must be same as its class name
2.Constructor must have no explicit return type*/