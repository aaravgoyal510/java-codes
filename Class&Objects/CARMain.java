public class CARMain {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        // Creating objects
        Car car1 = new Car("Red", 2024);
        Car car2 = new Car("Blue", 2025);
        
        // Accessing object properties
        System.out.println("Car 1 color: " + car1.color);
        System.out.println("Car 1 year: " + car1.year);
       
	// Calling object methods
        car1.start();


	System.out.println("Car 2 color: " + car2.color);
        System.out.println("Car 2 year: " + car2.year);
 
        // Calling object methods
        car2.start();

    }
}
