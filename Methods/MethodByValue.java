public class MethodByValue 
{
	static void increment(int num)
	{
        	num++;  // Changes are local to this method
    		System.out.println("After Increment the value is "+num);
	}
        public static void main(String[] args)
	{
            System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	int x = 5;
        	increment(x);
        	// x is still 5, as increment operates on a copy
        	System.out.println("The Original Value is not changed by the method it is as is " +x); // Output: 5
    }
}