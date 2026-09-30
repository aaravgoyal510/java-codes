public class ConditionalOperations
{
	public static void main(String args[])
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");

		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
	
		int z= ((x>y)? x:y);
		System.out.println("The Greater number in x and y is "+z); 
	}
}