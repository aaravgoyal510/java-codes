class NestedIf
{
	public static void main(String args[])
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116"); 
		int x = 2;
		int y = 1;

		if (x >= 0)
		{
    			if (y >= 0)
			{
        			System.out.println("Both the conditions are true");
    			} 
			else
			{
        			System.out.println("Outer Condition is true but Inner condition is false");
    			}
		} 
		else
		{
    			System.out.println("both the condition are false");
		}
	}
}
