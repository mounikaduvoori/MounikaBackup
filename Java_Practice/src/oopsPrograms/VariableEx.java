package oopsPrograms;

public class VariableEx 
{
int a=50;//instance variable
static int c=40;//static variable

public void var()
{
	int q=30;//local variable
	System.out.println(q);
	
}
	public static void main(String[] args)
	{
		VariableEx v=new VariableEx ();
		v.var();
		
	    v.a = 50;
	    System.out.println(VariableEx.c);
		System.out.println(v.a);
	}
}

/*Output:30
        40
        50 */

//A variable that is declared inside the method is called local variable.
/*A variable that is declared inside the class but outside the method is called 
instance variable . It is not declared as static.*/
//A variable that is declared as static is called static variable. It cannot be local.


/*public class VariableEx 
{
	   // this instance variable is visible for any child class.
	   public String name;
	   
	   // salary  variable is visible in Employee class only.
	   private double salary;
	   
	   // The name variable is assigned in the constructor. 
	   public VariableEx (String empName){
	      name = empName;
	   }

	   // The salary variable is assigned a value.
	   public void setSalary(double empSal){
	      salary = empSal;
	   }
	   
	   // This method prints the employee details.
	   public void printEmp(){
	      System.out.println("name  : " + name );
	      System.out.println("salary :" + salary);
	   }

	   public static void main(String args[]){
		   VariableEx e = new VariableEx("Mounika");
	      e.setSalary(1000);
	      e.printEmp();
	   }
	}
output:
name  : Mounika
salary :1000.0  */

