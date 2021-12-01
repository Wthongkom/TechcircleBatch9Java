package batch9day07_SwitchStatement;

import java.util.Scanner;

public class LearnScannerObject {

	public static void main(String[] args) {
		
		// int score = 90;
		
		
		Scanner irfan = new Scanner(System.in);
		
		System.out.println("Please enter the score");
		
		int score = irfan.nextInt();
		
		
		System.out.println("Your score is " + score);
		
		
		irfan.close();

	}

}
