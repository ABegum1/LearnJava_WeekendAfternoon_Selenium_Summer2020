package basics;

public class LearnDataType {
	//Data Type :
	//Primitive Data Type 
	/**
	 * byte
	 * short
	 * int
	 * long
	 * float
	 * double
	 * char
	 * boolean
	 */
	
	
	boolean isPizzaAvailable= true;
	boolean isAllowed= false; //1 bit
	
	char nameStartWith= 's'; //16bit
	
	byte number= 127; //8bit
	short price= 32767; //16bit 32767
	int age= 18; //32 bit 2147483647;
	long AnnualBudget= 9797989888L; //64 bit
	
	byte age1=18; //1 bit
			
	float salary = 500.50f; //32 bit 7 decimal
	double courseFee= 4000.20; //64bit 16 decimal
			
	
	
	
	
	
	//Non Primitive Data types
	/**
	 * Strings
	 * Objects
	 * Arrays
	 */
	String name="lem Lem"; //Any value you put inside double quote is counted as a string
	String phoneNumber ="9292832833";
	
	
	public static void main(String[] args) {
		
		//why object need to create?
		//To call the property from any class
		
		//Syntax of object: className objectName = new ConstructorofClass()
		
		// call property by object name
		
		LearnDataType obj = new LearnDataType();  //LearnDataType ConstructoofClass
		
		// .is used to create a relationship
		// call property by object name
		
		obj.age=20;
		System.out.println(obj.age);
		System.out.println(obj.AnnualBudget);
		System.out.println(obj.name);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
