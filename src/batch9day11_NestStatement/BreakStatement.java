package batch9day11_NestStatement;

public class BreakStatement {

	public static void main(String[] args) {
		
	for(int j = 1; j < 6; j++) {	
		for(int i = 1; i < 11; i++) {
			
			System.out.print(i + " ");
			
			if(i == 5) {
				break;
			}
			
		}
		
		//for(int j = 1; j < 6; j++) {
			System.out.println();
		}

	}

}
