package oopsPrograms;
/*A class that is declared with abstract keyword, is known as abstract class in java.
 It can have abstract and non-abstract methods (method with body).
 >>>A class that is declared as abstract is known as abstract class. It needs to 
 be extended and its method implemented. It cannot be instantiated.
 >>>A method that is declared as abstract and does not have implementation is known 
 as abstract method
 >>>>An abstract class can have data member, abstract method, method body, constructor
  and even main() method.
 */
interface A{  
		void a();  
		void b();  
		void c();  
		void d();  
		}  
		  
abstract class AbstractEx implements A
{  
 public void c()
   {
	 System.out.println("I am C");
   }  
}  
class M extends AbstractEx
{  
		public void a(){System.out.println("I am a");}  
		public void b(){System.out.println("I am b");}  
		public void d(){System.out.println("I am d");}  
		}  
class Demo
		{  
		public static void main(String args[])
		{  
		A a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
		}  
}
/*Output:
I am a
I am b
I am C
I am d */