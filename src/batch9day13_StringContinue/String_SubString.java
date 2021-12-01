package batch9day13_StringContinue;

public class String_SubString {

	public static void main(String[] args) {
		//             0123456789 
		String word = "television";
		
		String word2 = word.substring(2, 5);
		
		System.out.println(word2);
		
		System.out.println(word.substring(4));
				
		
		System.out.println(word.length());  // 10
		
		System.out.println(word.substring(4,word.length()));
		System.out.println(word.substring(4, 10));
		
		
// write a program to find the domain name of the following email.		
		
		String email2 = "test@gmail.com";
		System.out.println(email2.substring(5, 14));
		
		String email3 = "test@yahoo.com";
		System.out.println(email3.substring(5, 14));
		
		String email4 = "test@outlook.com";
		System.out.println(email4.substring(5, 16));
		
		String email5 = "test@github.com";
		System.out.println(email5.substring(5, 15));
		
		
		String email7 = "Firstnamelastname@gmail.com";
		
//		System.out.println(email.indexOf('@')+1, email.indexOf('.'));
		
		System.out.println(email7.substring(5, 10));
		
		System.out.println(email7.indexOf('@'));
		
		int starPosition = email7.indexOf('@')+1;
		int endPosition = email7.indexOf('.');
		
		System.out.println(email7.substring(starPosition,endPosition));
		
		
		String email = "Irfan.tursun@techcirclesolutions.org"; 
		
		int b = email.indexOf('@') + 1;
		int e = email.indexOf('.',b);
		int lastPosition = email.lastIndexOf('.');
		
		String domailName = email.substring(b,e);
		System.out.println(domailName); 
		
		String domain2 = email.substring(b,lastPosition);
		System.out.println(domain2);
		
			
		
// write a program to find first and last name of the given email
		
		
		String email6 = "Shafkat.ali@techcirclesolutions.org";
		
//		System.out.println(email6.lastIndexOf('.'));
//		
//		String first = email6.substring(0,email6.indexOf('.'));
//		System.out.println(first);
//		
//		String last = email6.substring(email6.indexOf('.')+1, email6.indexOf('@'));
//		System.out.println(last);
//		
		
//		System.out.println(email6.substring(0, 6) + " " + email6.substring(8, 11));
//		
//		System.out.println(email6.substring(8, 11));
		
		int i = email6.indexOf('.');
		int j = email6.indexOf('@');
		
		System.out.println(email6.substring(0, i));
		System.out.println(email6.substring(i+1, j));
		

	 }

}
