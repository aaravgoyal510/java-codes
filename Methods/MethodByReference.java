class Person
{
	String name;
	Person(String name) 
	{
        	this.name = name;
    	}
}
public class MethodByReference
{
	static void changeName(Person person)
	{
        	person.name = "John";
 	}
	public static void main(String[] args)
	{
	    System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	Person p = new Person("Alice");
        	changeName(p);
        	System.out.println(p.name); // Output: John
    	}
}

