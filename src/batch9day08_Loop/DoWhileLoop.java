package batch9day08_Loop;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int i = 0;
		
//		do {
//			System.out.println(i);
//			
//			i = 6;
//			
//		}
//		while(i<5);
		

//		do {
//			System.out.println(i);
//			
//			i++;
//			
//		}
//		while(i<5);

		do {
			System.out.println(i);
			
			if(i == 3) {
				break;
			}
			
			i++;
			// break;
			
		}while(i < 5);
		
		
		
		int a = 5;
		
		do {
			System.out.println(a);
		}while(a < 3);
		
		
		int b =10;
		
		do {
			System.out.println(b);
			b--;
		
		}while(b>1);
		
	}

}
