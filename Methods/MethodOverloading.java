public class MethodOverloading {
    static void print(int num) {
        System.out.println("Integer"  + num);
    }
    
    static void print(double num) {
        System.out.println("Double"  + num);
    }
    
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        print(5);        //Calls print(int)
        print(3.14);     //Calls print(double)
    }
}
