package ashlesha;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
    	
//         String name = new String("Ashlesha");
         String name = "Ashlesha";
         System.out.print("The name is: ");
         System.out.print(name);
    	
        int a = 6;
        float b = 5.6454f;
        
        System.out.printf("\nThe value of a is %d and value of b is %8.2f", a, b);
        System.out.format("\nThe value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);

    }
}
















