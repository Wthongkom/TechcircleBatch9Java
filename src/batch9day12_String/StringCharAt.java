package batch9day12_String;

public class StringCharAt {

	public static void main(String[] args) {
		//		      0123
		String str = "Java";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		
		//             0123456789
		String word = "TechCircle123456789z";
		
		System.out.println(word.length());   // 10 Character
		System.out.println(word.charAt(6));  // r
		System.out.println(word.charAt(3));  // h
		System.out.println(word.charAt(9));  // e
		
		System.out.println(word.charAt(10-1));  // e
		System.out.println(word.charAt(19));  // z
		System.out.println(word.charAt(word.length()-1));  // z
		
		
		
		
		
		
	}

}
