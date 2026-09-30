public class ConstDemo 
{
    // Constant variable
    public static final int MAX_VALUE = 100;

 	public static void testConstant()
	{
	//local constant-- inside a method
	final int localvar=25;
	System.out.println("The value of Localvar is: " + localvar);
	//localvar= 35;
	System.out.println("The value of Localvar is: " + localvar);
	}

	
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        // Trying to change the value of a constant will result in a compilation error
        //MAX_VALUE = MAX_VALUE+1; // This will produce a compilation error
        System.out.println("The maximum value is: " + MAX_VALUE);


	testConstant();
    }
}
