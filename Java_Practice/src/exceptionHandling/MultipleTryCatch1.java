package exceptionHandling;

public class MultipleTryCatch1 
{
		/*public static void main(String args[]){  
		   try{  
		    int a[]=new int[5];  
		    a[5]=30/0;  
		   }  
		   catch(Exception e)
		      {
			   System.out.println("common task completed");
			   }  
		   catch(ArithmeticException e)
		      {
			   System.out.println("task1 is completed");
			  }  
		   catch(ArrayIndexOutOfBoundsException e)
		      {
			   System.out.println("task 2 completed");
			   }  
		   System.out.println("rest of the code...");  
		 }  */
		 
}
  /*output:
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception

at exceptionHandling.MultipleTryCatch1.main(MultipleTryCatch1.java:14)  */