package batch9day04_Operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int numA = 10;
		int numB = 20;
		
		System.out.println(numA + numB); //30
		
		               //    20 - 10
		System.out.println(numB - numA); //10 
		
		
		System.out.println(numA * numB); //200
		
		
		System.out.println(numA / numB); //0
		
		
		int A = 10;
		double B = 20;
		System.out.println(A / B);
		
		int numC = 3;
		
		int numD = 2;
		
		int numE = 4;
		
		System.out.println(numA / numD); //5
		
		System.out.println(numA % numD); //0 (2,2,2,2,2)
		
		System.out.println(numA % 3); // 1 (3,3,3,1)
		
		System.out.println(numA % numE); // 2 (4, 4, 2)
		
		
		System.out.println(numA);
		
		numA++; //11  
		numA++; //12
		numA++; //13
		numA++; //14
		// numA = numA + 1;
			
		System.out.println(numA);
		
		numA--; // numA = numA - 1;
		numA--;
		numA--;
		numA--;
		
		System.out.println(numA); //10
		
		numA--;
		
		System.out.println(numA); //9
		
		numA--;
		
		System.out.println(numA);
		
		
	}

}
