// Import myvehicle package  and respective classes
import myvehicle.Car;
import myvehicle.Bike;
import myvehicle.Scooty;

//import myvehicle.*;//will not work


public class VehicleDemoClass
{
	public static void main(String[] args)
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
		// Create an instance of Car class
        	Car maruti = new Car();
        
        	// Call the display method of Car class
        	maruti.move();

		// Create an instance of Bike Class
        	Bike pulsor = new Bike();
        
        	// Call the display method of Car class
        	pulsor.move();
		
		// Create an instance of Scooty Class
        	Scooty activa = new Scooty();
        
        	// Call the display method of Car class
        	activa.move();

		


    	}
}

