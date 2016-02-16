package exceptionHandling;
//-------------FinalKeyword------------------
/*Final is used to apply restrictions on class, method and variable. 
  Final class can't be inherited, final method can't be overridden and final 
  variable value can't be changed  
public class FinalFinallyFinalizeEx 
{
	public static void main(String[] args){  
		final int x=100;  
		x=200;//Compile Time Error  
		System.out.println(x);
		}
}   */

//-------------FinallyBlock-------------------
/*public class FinalFinallyFinalizeEx 
{
public static void main(String[] args){  
try{  
int x=300;  
}catch(Exception e){System.out.println(e);}  
finally{System.out.println("finally block is executed");}  
}}
output:finally block is executed
>>>>>>Finally is used to place important code,
>>>>>>it will be executed whether exception is handled or not. */
//-------------FinalizeMethod-------------------
public class FinalFinallyFinalizeEx 
//Finalize is used to perform clean up processing just before object is garbage collected.
{
public void finalize(){System.out.println("finalize called");}  
public static void main(String[] args){  
	FinalFinallyFinalizeEx f1=new FinalFinallyFinalizeEx();  
	FinalFinallyFinalizeEx f2=new FinalFinallyFinalizeEx();  
f1=null;  
f2=null;  
System.gc();  
}}  
/*output:finalize called
finalize called  */