package oopsPrograms;
/*The super keyword in java is a reference variable that is used to refer immediate parent class object.
Whenever you create the instance of subclass, an instance of parent class is created implicitly 
i.e. referred by super reference variable.
Usage of java super Keyword
super is used to refer immediate parent class instance variable.
super() is used to invoke immediate parent class constructor.
super is used to invoke immediate parent class method.*/

/*Problem without super keyword
class SuperKeyword{  
  int speed=50;  
}  
class Bike3 extends SuperKeyword{  
  int speed=100;  
  void display(){  
   System.out.println(speed);//will print speed of Bike   
  }  
  public static void main(String args[]){  
   Bike3 b=new Bike3();  
   b.display();  
}  
}  */
public class SuperKeyword 
       {
		  int speed=50;  
		}  
		class SuperKeywordEx extends SuperKeyword
		{  
		  int speed=100;  
		  void display()
		  {  
		   System.out.println(super.speed);//will print speed of Bike   
		  }  
		  public static void main(String [] args)
		  {  
			  SuperKeywordEx  b=new SuperKeywordEx ();  
		   b.display();  
		}  }
//Output:50
