package oopsPrograms;

public class StaticVariableEx 
{
		   int rollno;  
		   String name;  
		   static String college ="Chaitanya";  
		   
     StaticVariableEx(int r,String n)
		   {  
		      rollno = r;  
		      name = n;  
		   }  
		    	void display ()
		    	{
		    		System.out.println("Example program for static variable");
		    		System.out.println(rollno+" "+name+" "+college);
		    	}  
		  
		   public static void main(String args[])
		  	{  
			   System.out.println(college);
	   		StaticVariableEx s1 = new StaticVariableEx(111,"Mouni");  
	   		StaticVariableEx s2 = new StaticVariableEx(222,"Chinni");  
		   
		   		s1.display();  
		   		s2.display();  
             }  	  
}

/* Output:
  Chaitanya
Example program for static variable
111 Mouni Chaitanya
Example program for static variable
222 Chinni Chaitanya
*/

/* The static keyword in java is used for memory management mainly. We can apply
 *  java static keyword with variables, methods, blocks and nested class. The static 
 *  keyword belongs to the class than instance of the class.

The static can be:

variable (also known as class variable)
method (also known as class method)
block
nested class
 */

/*If you declare any variable as static, it is known static variable.

The static variable can be used to refer the common property of all objects (that is not unique for each object) e.g. company name of employees,college name of students etc.
The static variable gets memory only once in class area at the time of class loading.*/
 