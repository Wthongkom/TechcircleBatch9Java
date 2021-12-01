package batch9day09_LoopReview;

public class AsciiTableTest {

	public static void main(String[] args) {
		
		char variableA = 65;
		
		System.out.println(variableA);
		
		
		char variableH = 72;
		
		System.out.println(variableH);
		
		
System.out.println("-----------------------------------");
		
		
//		for(int i = 65; i <= 90; i++) {
//			
//			char charValue = (char)i;
//			
//			System.out.println(charValue);
//		}
			
//System.out.println("-----------------------------------");

		for(char i = 97; i <= 122; i++) {
	
			System.out.println(i);

		}

System.out.println("-----------------------------------");
		
		for(char i = 48; i <= 57; i++) {
			
			System.out.println(i);

		}
System.out.println("-----------------------------------");


//		String str = "A1b2c3";
		
		char a = 'a';
		int valueOfa = a;
		System.out.println(valueOfa); // a = 97 ASCII Table

		char z = 'z';
		int valueOfz = z;
		System.out.println(valueOfz); // z = 122 ASCII Table
		
		for(int i = valueOfa; i <= valueOfz; i++) {
			System.out.println((char)i);
			System.out.println(i);
			
		}


	}

}
