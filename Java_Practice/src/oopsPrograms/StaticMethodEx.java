package oopsPrograms;
/*If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it. */
public class StaticMethodEx
{
	     int rollno;  
	     String name;  
	     static String college ="Chaitanya";  
	       
	     static void change()
	     {  
	     System.out.println("Example program for static method");
	     college = "Narayana";  
	     }  
	  
	     StaticMethodEx(int r, String n)
	     {  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display ()
	     {
	    System.out.println(rollno+" "+name+" "+college);
	     }  
	   public static void main(String args[])
	   {  
		   System.out.println(college);
		   StaticMethodEx.change();  
	  
	    	StaticMethodEx s1 = new StaticMethodEx (111,"Mouni");  
	    	StaticMethodEx s2 = new StaticMethodEx (222,"Chinni");  
	      s1.display();  
	      s2.display();    
	    }  
}  


/*Output:
Chaitanya
Example program for static method
111 Mouni Narayana
222 Chinni Narayana
*/