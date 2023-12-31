package ashlesha;

public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 4;
        int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder
        System.out.println(b);

        // 2. Assignment Operators
        int c = 9;
        c *= 3;
        System.out.println(c);

        // 3. Comparison Operators
        System.out.println(64<6);

        // 4. Logical Operators
        System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);
        
    }
}
