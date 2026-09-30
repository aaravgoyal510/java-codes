import java.io.IOException;

// Superclass
class SuperClass 
{
	public void display() throws IOException
	{
        	System.out.println("SuperClass display method");
    	}
}

// Subclass
class SubClass extends SuperClass 
{
	@Override
    	public void display() throws IOException
	{
        	System.out.println("SubClass display method");
}
    	}

//Subclass with more specific exception
class AnotherSubClass extends SuperClass
{
	    @Override
    	public void display() //throws EOFException // FileNotFoundException is a subclass of IOException
	{ 
        	System.out.println("AnotherSubClass display method");
   	 }
}

// Main class to demonstrate overriding with throws clause
public class OverridingWithThrowsClause
{
	public static void main(String[] args)
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	SuperClass obj1 = new SubClass();
        	SuperClass obj2 = new AnotherSubClass();

        	try 
		{
            		obj1.display(); // Outputs: SubClass display method
           		obj2.display(); // Outputs: AnotherSubClass display method
        	} 
		catch (IOException e) 
		{
            		e.printStackTrace();
        	}
	}
}
