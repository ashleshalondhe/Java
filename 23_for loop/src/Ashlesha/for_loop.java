package Ashlesha;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		
		// # how to use for loop
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		// # Print first n odd numbers using for loop
		
	//	2i = Even Numbers = 0,2,4,6,8
   //	2i+1 = Odd NUmbers = 1,3,5,7,9	
		
//		int n = 10;
//		for(int i=0; i<n; i++) {
//			
//			System.out.println(2*i+1);
//		}
		
		
		// # Decrementing for loop
		
//		for(int i= 5; i!=0; i--) {
//			System.out.println(i);
//		}
		
		// # Print first n natural numbers in reverse order
		Scanner naturalNumber = new Scanner(System.in);
		
        System.out.print("Enter the total number of natural numbers \nthat you want to print in reverse order: ");
        
            int num = naturalNumber.nextInt();
                 for (int i = num; i != 0; i--) {
                     System.out.println(i);
                 }

	}

}
