package exceptionHandling;
/*Java finally block is a block that is used to execute important code such as closing 
connection, stream etc.
Java finally block is always executed whether exception is handled or not.
Java finally block must be followed by try or catch block. 
The finally block will not be executed if program exits(either by calling System.exit() 
or by causing a fatal error that causes the process to abort).
For each try block there can be zero or more catch blocks, but only one finally block.*/

public class FinallyEx 
{
		  public static void main(String []args)
		  {  
		  try{  
		   int data=25/5;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){System.out.println(e);}  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }	
}
/*output:5
finally block is always executed
rest of the code...  */

/*class FinallyEx {  
	  public static void main(String args[]){  
	  try{  
	   int data=25/0;  
	   System.out.println(data);  
	  }  
	  catch(NullPointerException e){System.out.println(e);}  
	  finally{System.out.println("finally block is always executed");}  
	  System.out.println("rest of the code...");  
	  }  
}  
output:
Exception in thread "main" java.lang.ArithmeticException: / by zero
at exceptionHandling.FinallyEx.main(FinallyEx.java:30)
finally block is always executed */
