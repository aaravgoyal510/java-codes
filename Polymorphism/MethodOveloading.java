class MathUtils
{
	// Overloaded method with two integer parameters
	public int add(int a, int b)
	{
       		 return a + b;
	}

    	// Overloaded method with three integer parameters
    	public int add(int a, int b, int c) 
	{
        	return a + b + c;
   	 }

    	// Overloaded method with two double parameters
    	public double add(double a, double b) 
	{
        	return a + b;
    	}
}

public class MethodOveloading 
{
	public static void main(String[] args)
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	MathUtils mathUtils = new MathUtils();
		// Input through command line Argument.
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		double num4=Double.parseDouble(args[3]);
		double num5=Double.parseDouble(args[4]);


       	 	// Calling the overloaded methods
        	System.out.println(mathUtils.add(num1,num2));         // Outputs-Addition of first two no
        	System.out.println(mathUtils.add(num1,num2,num3));      // Outputs- Addition of first three no

        	System.out.println(mathUtils.add(num4,num5));     // Outputs: Addition of last two floating number

    }
}
