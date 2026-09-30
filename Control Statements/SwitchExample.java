import java.util.*;
public class SwitchExample {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any Numberfrom 10 to 70 and we will say you the day of the week .. ");
		//int num = sc.nextInt();
		//int dayOfWeek = (num/10);
		int num=Integer.parseInt(args[0]);
        
        switch (num/10) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
               break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
		
		/* This is multiline comeent which is not executrd by the compiler*/
            default:
                System.out.println("Invalid day");
        }
    }
}
