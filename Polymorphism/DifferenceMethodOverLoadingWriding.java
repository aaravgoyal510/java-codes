// Superclass
class SuperClass 
{
	public void display()
	{
        	System.out.println("Display method in SuperClass");
    	}
}

// Subclass
class SubClass extends SuperClass
{
	    @Override
	public void display() 
	{
		System.out.println("Display method in SubClass");
    	}

    	// Overloaded method with different parameters
	public void display(String message) 
	{
        	System.out.println("Display method with message: " + message);
    	}
}

public class DifferenceMethodOverLoadingWriding
{
    	public static void main(String[] args)
	{
    	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	SuperClass superClass = new SuperClass();
        	SubClass subClass = new SubClass();

        	superClass.display(); // Outputs: Display method in SuperClass
        	subClass.display();   // Outputs: Display method in SubClass-- Overridden Method
        	subClass.display("Hello"); // Outputs: Display method with message: Hello-- overloadeded Method
    }
}
