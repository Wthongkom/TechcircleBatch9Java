package batch9day09_LoopReview;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	
		
//		Task 3:
//		
//		Write a program that ask the user to input a positive Integer.
//		It should then print the multiplication table of that number
//		
//	    range of the number is between 1 - 10;
//	    
//		input : 5
//	    
//		output:
//		
//			1 x 5 = 5
//          2 x 5 = 10
//          3 x 5 = 15
//          10 x 5 = 50	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number between 1~10");
		
//		int num = 5;
		int input = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
//			System.out.println(i + " x " + i + " = " +input*i);
//			System.out.println(i+" X "+input+" = "+ input*i);
			System.out.println(input+" X "+i+" = "+ input*i);
			
		}
		
		scan.close();
		
		
		
		
		
		
	}

}
