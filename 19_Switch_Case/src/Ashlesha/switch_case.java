package Ashlesha;
import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		
		int age ;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age= sc.nextInt();
		
		switch(age) {
		case 18:
			System.out.println("You are becaming an adult!");
			break;
			
		case 23:
			System.out.println("You are gona get job!");
			break;
			
		case 60:
			System.out.println("You are gona get retried!");
			break;
		
		default:
			System.out.println("Enjoy your life!");
		}
		
		System.out.println("Thanks For visiting!");
	 	
	}

}
