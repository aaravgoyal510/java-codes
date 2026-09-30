import java.util.*;

class MatricsSubtraction
{
	public static void main(String argh[])
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
		Scanner sc=new Scanner(System.in);
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		int resmat[][]=new int[3][3];

		//reading data for both the Matrics from Keyboard
		System.out.println("Enter the Values for First matrics");
		for(int i=0; i<3;i++) //for rows of the matrics
		{
			for(int j=0;j<3;j++)//for collumns
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Values for Second matrics");
		for(int i=0; i<3;i++) //for rows of the matrics
		{
			for(int j=0;j<3;j++)//dor collumns
			{
				mat2[i][j]=sc.nextInt();
			}
		} 
		
		//Display the elements of both the original Matrics.
		System.out.println("The Elements of the first matrics are as following");
		int len=mat1.length;
		System.out.println("The The Lenth of the Multidimentional array is  "+len);
		for(int i=0; i<3;i++) //for rows of the matrics
		{
			for(int j=0;j<3;j++)//dor collumns
			{
				System.out.print(mat1[i][j]+ "  ");
			}
			System.out.println();

		}
		System.out.println("The Elements of the Second matrics are as following");
		for(int i=0; i<3;i++) //for rows of the matrics
		{
			for(int j=0;j<3;j++)//dor collumns
			{
				System.out.print(mat2[i][j]+ "  ");
			}
			System.out.println();

		}



		//Performing Subtraction of both the Matrics
		
		for(int i=0; i<3;i++) //for rows of the matrics
		{
			for(int j=0;j<3;j++)//dor collumns
			{
				resmat[i][j]= mat1[i][j] - mat2[i][j];
			}
		}
		
		//Printing the Result Matrics
		System.out.println("The Elements of the Result Matrics are as following");
		for(int i=0; i<3;i++) //for rows of the matrics
		{
			for(int j=0;j<3;j++)//dor collumns
			{
				System.out.print(resmat[i][j]+ "  ");
			}
			System.out.println();

		}
	}
}

 
