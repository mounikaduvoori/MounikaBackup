package oopsPrograms;

public class MethodOverridingBankEx 
 { 
		int getRateOfInterest()
		{
			return 0;
		}  
 }  
	class SBI extends MethodOverridingBankEx 
	{  
		int getRateOfInterest()
		{
			return 8;
		}  
	}  
	class ICICI extends MethodOverridingBankEx 
	{  
		int getRateOfInterest()
		{
			return 7;
		}  
	}  
	class AXIS extends MethodOverridingBankEx 
	{  
		int getRateOfInterest()
		{
			return 9;
		}  
	}  
class Test
		{  
		public static void main(String args[])
		{  
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
		}  	 
}
/*Output:
	SBI Rate of Interest: 8
	ICICI Rate of Interest: 7
	AXIS Rate of Interest: 9 */

/*If subclass (child class) has the same method as declared in the parent class,
 *  it is known as method overriding in java.

In other words, If subclass provides the specific implementation of the method that 
has been provided by one of its parent class, it is known as method overriding.

Usage of Java Method Overriding

Method overriding is used to provide specific implementation of a method that is 
already provided by its super class.
Method overriding is used for runtime polymorphism
Rules for Java Method Overriding

method must have same name as in the parent class
method must have same parameter as in the parent class.
must be IS-A relationship (inheritance).
*/
