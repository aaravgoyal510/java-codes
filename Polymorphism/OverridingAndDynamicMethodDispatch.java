// Superclass
class Animal 
{
	public void sound() 
	{
		System.out.println("Animal makes a sound");
	}
}

// Subclass
class Dog extends Animal
{
    		@Override
		public void sound()
		{
        		System.out.println("Dog barks");
    		}
}

// Subclass
class Cat extends Animal
{
	@Override
	public void sound() 
	{
        	System.out.println("Cat meows");
    	}
}

// Main class to demonstrate polymorphism
public class OverridingAndDynamicMethodDispatch 
{
	public static void main(String[] args)
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting

        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows
    }
}
