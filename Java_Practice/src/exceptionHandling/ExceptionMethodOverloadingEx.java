package exceptionHandling;

import java.io.*;
public class ExceptionMethodOverloadingEx
{
	void msg(){System.out.println("parent");}  
	}  
	  
	class TestExceptionChild extends ExceptionMethodOverloadingEx{  
	  void msg()throws ArithmeticException{  
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
		  ExceptionMethodOverloadingEx p=new TestExceptionChild();  
	   p.msg();  
	  } 
}
//output:TestExceptionChild
	
//>>If the superclass method does not declare an exception, subclass overridden method 
//  cannot declare the checked exception but can declare unchecked exception.
	
/*There are many rules if we talk about methodoverriding with exception handling.
  The Rules are as follows:
    >>If the superclass method does not declare an exception
	>>If the superclass method does not declare an exception, subclass overridden method
	cannot declare the checked exception but it can declare unchecked exception.
	>>If the superclass method declares an exception
	>>If the superclass method declares an exception, subclass overridden method can 
	declare same, subclass exception or no exception but cannot declare parent exception.
	*/