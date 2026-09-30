class MyException extends Exception 
{
	public MyException(String message)
	{
		super(message);
    	}
}

public class UserDefinedException
{
	public static void main(String[] args)
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	try
		{
            		
		MyException me = new MyException("This is a user-defined exception");
		throw me;
        	} 
		catch (MyException e) 
		{
            		System.out.println("Caught: " + e.getMessage());
        	}
    	}
}