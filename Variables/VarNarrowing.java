public class VarNarrowing{  
public static void main(String[] args){
    System.out.println("Made by Aarav Goyal ERP 0251BCA116");  
float fvalue=10.5f;  
//int intvalue=fvalue;//Compile time error  

int intvalue=(int)fvalue;
float testinttofloat=intvalue;
  
System.out.println("The floating value is "+fvalue);  
System.out.println("The Intergral value is "+intvalue);
System.out.println("The inttofloat value is "+testinttofloat);

//Using Wrapper Class

int tempwrapper= Integer.parseInt(args[0]);
System.out.println("The value received from CommandLine and after conversion into int is     "+tempwrapper);

float tempwrapperfloat= Float.parseFloat(args[0]);
System.out.println("The value received from CommandLine and after conversion into float is     "+tempwrapperfloat);

double tempwrapperdouble= Double.parseDouble(args[0]);
System.out.println("The value received from CommandLine and after conversion into double is     "+tempwrapperdouble);




 
}}  
