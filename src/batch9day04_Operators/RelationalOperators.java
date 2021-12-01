package batch9day04_Operators;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		int a = 3;
		
		int b = 4;
		
		int c = 2;
		
		int d = 3;
		
		// == , != , >= , <= , > , <
		
		System.out.println(a == d);
		
		boolean result = a == d;
		
		System.out.println(result);
		//                 3 > 4
		System.out.println(a > b);
		
		result = a > b;
		
		System.out.println(result);
		// != not equals
		System.out.println(a != b);
		
		System.out.println(a >= b);  // false
		//                 3 <= 4
		System.out.println(a <= b);  // true
		
		System.out.println(a != d);  // false
		
		System.out.println(a >= d);  // true
		System.out.println(a <= d);  // true
		
		
		//                 2 + 3 > 4
		System.out.println(a + c > b);
		
		System.out.println(a + c < b);
		
		
		result = a * b < c;
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}

}
