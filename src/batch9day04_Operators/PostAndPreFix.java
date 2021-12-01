package batch9day04_Operators;

public class PostAndPreFix {

	public static void main(String[] args) {
		
		
		int numA = 10;
		numA++;
		System.out.println(numA);
		
		System.out.println(numA++); //12
		
		System.out.println(numA);
		
		System.out.println(numA--); //12
		
		System.out.println(numA);
		
		//prefix --> before the variable name;
		
		int a = 10;
		
		++a;
		
		System.out.println(a); //11
		
		System.out.println(++a); //12
		
		System.out.println(--a); //11
		System.out.println(a); //11
		
		System.out.println(a--); //11
		
		System.out.println(a); //10
		

	}

}
