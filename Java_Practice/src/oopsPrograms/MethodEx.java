package oopsPrograms;

public class MethodEx 
{
	public void add()//Method name should start with small letter
    {
	 int a=10;
	 int b=20;
	 int c=a+b;
	 System.out.println("addition is:"+c);
    }
       public void sub()//Method name should start with small letter
         {
	      int p=10;
	      int q=20;
	      int r=p-q;
	      System.out.println("addition is:"+r);
          }
	public static void main (String []args)
	{
	 System.out.println("Example program for Methods in java");
	 MethodEx m=new MethodEx();
	 m.add();
	 m.sub();	
	}
	
}
	/*output:
Example program for Methods in java
addition is:30
addition is:-10
*/
