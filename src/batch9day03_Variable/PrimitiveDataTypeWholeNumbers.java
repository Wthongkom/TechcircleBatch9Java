package batch9day03_Variable;

public class PrimitiveDataTypeWholeNumbers {

	public static void main(String[] args) {

    // byte, short, int, long
		
		byte day = 7;
		
		byte month = 8;
		
		short page = 254;
		
		int distance = 268;
		
		long phonenumber = 5714921916L;

		System.out.println(phonenumber);
		
		long ssn = 123_45_6789;
		
		System.out.println(ssn);	
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		// -128 ~ 127
		int page2 = 254;
		
		System.out.println(page2);
		
		byte page3 = (byte)254;
		
		System.out.println(page3);
		
		
		long phone2 = 7031231234L;
		
		System.out.println(phone2);
		
		int phone3 = (int)7031231234L;
		
		System.out.println(phone3);	
		
		byte numberOfStudent = 60;
		
		System.out.println(numberOfStudent);
		
		
		//You can add your comment here
		
/*  In Java, there are two types of casting:

    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

	Narrowing Casting (manually) - converting a larger type to a smaller size type
	double -> float -> long -> int -> char -> short -> byte

*/
		
		
		byte valueA = 50;
		
		short valueB = valueA;
		
		long valueC = valueA;
		
		System.out.println(valueB);
		
		System.out.println(valueC);
		
		
		
		long valueL =30;
		
		int valueI = (int)valueL;
		
		System.out.println(valueI);
		
		
		
		float taxRate = 0.3F;
		
		double price = 9.99;
		
		double balance = 100.35;
		
		
		
		int priceInt = (int)price;
		
		System.out.println(price);//9.99
		System.out.println(priceInt);
		
		
		System.out.println("Value of variable price is "+ price);//9.99
		System.out.println("Value of variable priceInt is "+priceInt);
		
		
		String email = "keawzza@gmail.com";
		String firstname = "Watcharapong";
		String lastname = "Thongkom";
		long phoneNumber = 571_492_1916L;
		String pass = "pass1234567";
		
		//System.out.println(email);
		//System.out.println(firstname);
		//System.out.println(lastname);
		//System.out.println(phonenumber);
		//System.out.println(pass);
		
		
        System.out.println("Create your Target account");
		
		System.out.println("Email : "+ email);
		
		System.out.println("First Name : "+firstname);

		System.out.println("Last name : "+ lastname);
		
		System.out.println("Phone number : " + phoneNumber);
		
		System.out.println("Password : "+ pass);
		
		
		
		
		
		
	}

}
