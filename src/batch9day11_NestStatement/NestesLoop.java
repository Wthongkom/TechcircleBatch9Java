package batch9day11_NestStatement;

public class NestesLoop {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 5; i++) {  
////			System.out.println(i);
//			System.out.println("Value of i <" + i + ">");
//			
//			for(int j = 1; j <= 5; j++) {  
//				System.out.println(j);
//			}
//		}		
		
//	write a program to print below statement
//	use nested for loop
//	1 2 3	
//	1 2 3
//	1 2 3
		
	for(int b = 0; b < 3; b++) { 
		for(int a = 1; a <= 3; a++) {
			System.out.print( a + " " );
		}			
		System.out.println();
	}
			
//		for(int b = 0; b < 3; b++) {  
//				System.out.println("Hello");
//		}
		
	}

}
