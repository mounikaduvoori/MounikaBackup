package exceptionHandling;
/*The Java throw keyword is used to explicitly throw an exception.
We can throw either checked or uncheked exception in java by throw keyword. 
The throw keyword is mainly used to throw custom exception. We will see custom 
exceptions later.
Syntax:throw exception;
Example:throw new IOException("sorry device error); 
*/
public class ThrowEx 
{
	public static void validate(int age)
	{  
		     if(age<18)  
		      throw new ArithmeticException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
		   public static void main(String args[]){  
		      ThrowEx te=new ThrowEx();  
		      te.validate(16);
		      System.out.println("rest of the code...");  
    }  		 
}
/*Output:
Exception in thread "main" java.lang.ArithmeticException: not valid
at exceptionHandling.ThrowEx.validate(ThrowEx.java:8)
at exceptionHandling.ThrowEx.main(ThrowEx.java:14)  */