package batch9day09_LoopReview;

public class Loops {

	public static void main(String[] args) {
		
		
//		 tasks: 
//		 1. print out the numbers between 0 ~ 100 
		
		int num = 0;
		
		while (num <= 100 ) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("-----------------------------");
		
		do {
			System.out.println(num);
			num++;
		}while(num < 101);
		
		System.out.println("-----------------------------");
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------");		
		
//		 2. print out the numbers between 100 ~ 200 
		
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
		}

		System.out.println("-------------------");

		num = 100;

		do {
			System.out.println(num);
			num++;
		} while (num < 201);

		System.out.println("-------------------");
		
//		 3. print out all the odd numbers between 0 ~ 100 
		
		int a = 5;
		
		System.out.println(a % 2);  // 2,2,1
		
		if (a % 2 == 1) {
			System.out.println("odd number");
		}
		
		for (int i = 0; i <= 100; i++) {
			//if number%2 == 1 it means its an odd number
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("-----------------------------");
		
//		 4. print out all the even numbers between 0 ~ 100 
		
		for (int i = 0; i <= 100; i++) {
			//if number%2 == 0 it means its an even number
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("-----------------------------");
		
//		 5. do 500 push ups
		
		for(int s = 0; s <= 500;) {
			s++;
			System.out.println("Push up " + s);
	
		}

		System.out.println("-----------------------------");
	
//      6. print out all the numbers divisible by 2 or 3 or 5		
//		range is between 0 ~ 100		
		
		for(int b = 0; b <= 100; b++) {
			
			if(b%2 == 0) {
				System.out.println("Two");
			
			}else if(b%3 == 0) {
				System.out.println("Three");	
			
			}else if(b%5 == 0) {
				System.out.println("Five");	
			
			}else {
				System.out.println("b");
			}
			
	
		}
		
		
	}

}
