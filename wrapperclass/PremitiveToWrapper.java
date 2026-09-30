class PremitiveToWrapper
{
	public static void main(String args[])
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
 		//premitive to Wrapper
		int num = 10;
		Integer numWrapper = Integer.valueOf(num); // Converting int to Integer
		System.out.println("After Conversion from premitive to wrapper the value of the Integer Object is "+numWrapper);
		
		//Wrapper to Premeitive type
		Integer wrappernum = 20;
		num = wrappernum.intValue(); // Converting Integer to int
		System.out.println("After conversion of the wrapper the int value is "+num);





	}
}
