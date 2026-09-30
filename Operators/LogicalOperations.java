public class LogicalOperations {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        boolean x = true;
        boolean y = false;
	boolean a = true;
        boolean b = false;

        
        // Logical AND
        System.out.println("x AND y: " + (x && y));//false
        System.out.println("x AND a: " + (x && a));//true
	System.out.println("y AND b: " + (y && b));//false
	System.out.println("y AND x: " + (y && x));//false

       
	 // Logical OR
        System.out.println("x OR y: " + (x || y));//true
	System.out.println("x OR a: " + (x || a));//true
       	System.out.println("y OR b: " + (y || b));//false
	System.out.println("y OR x: " + (y || x));//true
	
	// Logical NOT
        System.out.println("NOT x: " + (!x));//false
	System.out.println("NOT y: " + (!y));//true

    }
}
