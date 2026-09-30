public class MyClass 
{
	private int id;
	public MyClass(int id)
	{
        	this.id = id;
		System.out.println("Hello i am the object no"+id);
    	}

    	public void finalize()
	{
        	System.out.println("Object with ID " + id + " is being finalized.");
        	// Any cleanup operations can be performed here
   	 }

    	public static void main(String[] args) 
	{
    	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	// Creating objects
        	MyClass obj1 = new MyClass(1);
        	MyClass obj2 = new MyClass(2);
        
        	// Nullifying references to objects
        	obj1 = null;
        	obj2 = null;
        
		//System.out.println("Hello after nullifying i am the object no"+obj1.id);
		//it will generate Exception Cannot read field "id" because "<local1>" is null 

        	// Requesting garbage collection
        	System.gc(); // This may not force immediate garbage collection
        
       		 // Other operations
        	System.out.println("Program is still running...");
    }
}
