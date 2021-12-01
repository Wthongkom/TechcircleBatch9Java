package batch9day05_IfStatement;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int score = 55;
		
		char grade = ' ';
		
		// 0 <= score <= 100 
		if(score >= 0 && score <= 100) {
			// 90 <= score <= 100
			if(score >= 90 && score <= 100) {
				grade = 'A';
			}
			
			// 80 <= score <= 90
			if(score >= 80 && score <= 90) {
				grade = 'B';
			}
			
			// 70 <= score <= 80
			if(score >= 70 && score <= 80) {
				grade = 'C';
			}
			// 60 <= score <= 70
			if(score >= 60 && score <= 70) {
				grade = 'D';
			}
			// 0 <= score <= 60
			if(score >= 0 && score <= 60) {
				grade = 'F';
			}
			
		}else {
			System.out.println("Invalid score!!");
		}
			
			System.out.println("Your score is " + score + " grade is " + grade);

		
		
			
			int temperature = 75;
			boolean sunny = false;
			
			if(temperature > 90) {
				if (sunny) {
					System.out.println("Beach");
			}else {
					System.out.println("Movie");
			}
			
			}else {	
				if(sunny) {
					System.out.println("Tennis");
			}else {
					System.out.println("Soccer");
			}
			

		}	
		
	}

}
