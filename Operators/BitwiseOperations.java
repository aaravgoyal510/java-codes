public class BitwiseOperations {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        int a = 5; // 101
        int b = 3; // 011
        
        // Bitwise AND
        int bitwiseAnd = a & b; // 001
        System.out.println("Bitwise AND: " + bitwiseAnd);
        
        // Bitwise OR
        int bitwiseOr = a | b; // 111
        System.out.println("Bitwise OR: " + bitwiseOr);
        
        // Bitwise XOR
        int bitwiseXor = a ^ b; // 110
        System.out.println("Bitwise XOR: " + bitwiseXor);
        
        // Bitwise NOT
        int bitwiseNotA = ~a; // 11111111111111111111111111111010
        System.out.println("Bitwise NOT of a: " + bitwiseNotA);
        
        // Left shift
        int leftShift = a << 2; // 1010
        System.out.println("Left shift of a: " + leftShift);
        
        // Right shift
        int rightShift = a >> 2; // 10
        System.out.println("Right shift of a: " + rightShift);
    }
}
