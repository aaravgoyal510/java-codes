class temp
{
//we are using this class to demonstratate Instance Variable
public int intsancevar=100;
public void method()  
    {    
        int localvar=90;//local variable 
	//local variable can be used inside the local block of the method.
	System.out.println("Hi Everyone i am from a Lethod and i have one local variable named localvar"+localvar);   
    }  
}


public class VariableDemo 
{  
    //public int instvar=100;//instance variable
    static int staticvar=100;//static variable  
    
    public static void main(String args[])  
    {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");  
        
	System.out.println("Static Variable"+staticvar);
	
	temp t =new temp();
	
	System.out.println("Instance Variable"+t.intsancevar);
	t.method();

    }  
}//end of class   
