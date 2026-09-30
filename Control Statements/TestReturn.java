public class TestReturn
{
	public static void main(String[] args) 
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	// Using return statement
        	System.out.println("\nUsing return statement:");
        	
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int result = add(num1, num2);
        	System.out.println("Result of addition: " + result);
   	 }

   	 // Method to add two numbers
   	 public static int add(int a, int b)
	 {
       		 return a + b; // returns the sum of a and b
    	 }
}
