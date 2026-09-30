class TestException
{
	public static void main(String args[])
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
	//try block to execute the code to be handled
	try
	{
    		int data = 50 / 0;
		System.out.println("The value is "+data);
	} 
	catch (NullPointerException e) 
	{
    		
		System.out.println("Hey I am from Catch block of ArithmaticException and it is observed that this exception is generated");
		System.out.println("Arithmetic Exception caught: " + e);
	} 
	catch (ArithmeticException e) 
	{
    		
		System.out.println("Hey I am from Catch block of ArithmaticException and it is observed that this exception is generated");
		System.out.println("Arithmetic Exception caught: " + e);
	} 

	finally
	{
    		System.out.println("Finally block executed");
	}
	}
}
