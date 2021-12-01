package batch9day13_StringContinue;

public class StringIndexOf {

	public static void main(String[] args) {
					// 012345678910  index position
		String name = "President George Washington";

		System.out.println(name.indexOf('e'));  // 2
		
		System.out.println(name.charAt(2));  // e
		
		System.out.println(name.length());
		
		System.out.println(name.indexOf('e', 8));  // 11 // start looking 8 up
		
		System.out.println(name.indexOf("George"));  // 10
		
		System.out.println(name.indexOf("Washington"));  // 17
		
		System.out.println(name.charAt(17));  // w
		
		System.out.println(name.indexOf("ident")); // 4
		
		System.out.println(name.indexOf("id"));  // 4
		
		System.out.println(name.indexOf("ton"));  // 24
		
		System.out.println(name.indexOf("keaw"));  // -1
		
		System.out.println(name.indexOf('z'));
		
		
		
		
	}

}
