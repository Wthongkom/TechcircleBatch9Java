package batch9day12_String;

public class EmptyString {

	public static void main(String[] args) {
		
		String str = "";
		
		System.out.println(str.length());
		
		String str2 = new String();
		System.out.println(str2.length());
		
		
		String word = new String();
		
		for(int i = 1; i <= 30; i++) {
			
			if(i % 3 == 0) {
				word = "FIN";
			}
			if(i % 5 == 0) {
				word = "RA";
			}
			if(i % 5 == 0 &&  i % 3 == 0) {
				word = "FINRA";
			}
			if(word.length()>0) {
				System.out.println(word);
			}else {
				System.out.println(i);
			}
			
			word = "";
		}
			
		
		char[] chars = {'J','a','v','a'};
		
		String letter = new String(chars);
		
		System.out.println(letter);

	// Array
		
		  
		
		//   String a = "123";
		
		
		
		
		
		
	}

}
