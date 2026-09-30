public class ArrayExample {
    public static void main(String[] args) 
	{
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	// One-dimensional array
       		 int numbers[] = new int[5];
        	 numbers[0] = 10;
        	 numbers[1] = 20;
       		 numbers[2] = 30;
        	 numbers[3] = 40;
                 numbers[4] = 50;

        // Multidimensional array
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        // Accessing elements
        System.out.println("Element at index 2 of numbers array: " + numbers[2]);
        
	System.out.println("Element at (1, 2) of matrix: " + matrix[1][2]);

        // Iterating through numbers array
        System.out.println("Numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        // Iterating through matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
