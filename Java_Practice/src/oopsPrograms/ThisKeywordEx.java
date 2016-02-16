package oopsPrograms;

/*public class ThisKeywordEx
{
	    int id;  
	    String name;  
	      
	    	ThisKeywordEx(int id,String name)
	    	{  
	    		id = id;  
	    		name = name;  
	    	}  
	    void display()
	    	{
	    	System.out.println(id+" "+name);
	    	}  	  
	    public static void main(String args[])
	    	{  
	    	ThisKeywordEx s1 = new ThisKeywordEx(111,"Karan");  
	    	ThisKeywordEx s2 = new ThisKeywordEx(321,"Aryan");  
	    	s1.display();  
	    	s2.display();  
	    	}  	  
}*/
//If there is ambiguity between the instance variable and parameter, this keyword resolves the problem of ambiguity.

public class ThisKeywordEx
{
    int id;  
    String name;  
      
    	ThisKeywordEx(int id,String name)
    	{  
    		    this.id = id;  
    		    this.name = name;  
    	}
    void display()
    	{
    	System.out.println(id+" "+name);
    	}  	  
    public static void main(String args[])
    	{  
    	ThisKeywordEx s1 = new ThisKeywordEx(111,"Mouni");  
    	ThisKeywordEx s2 = new ThisKeywordEx(321,"Chinni");  
    	s1.display();  
    	s2.display();  
    	}  	 
    }

/*Output:
111 Mouni
321 Chinni */

