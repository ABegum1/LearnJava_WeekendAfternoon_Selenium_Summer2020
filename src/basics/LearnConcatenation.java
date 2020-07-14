package basics;

public class LearnConcatenation {
	
	//Concat-e-nation
	
	 static String firstName="James";
	 static String lastName="Williams";
	 static String studentID="3021NY";
	
	static String fullName=firstName+" "+lastName; // + is called Concat-e-nation
	
	String stName= "Syed Raza";
	
	
	public static void main(String[] args) {
		System.out.println("My full name is : "+LearnConcatenation.fullName); //string + variable
		
		int num1=5;
		int num2=7;		
		int sum=num1+num2;
		System.out.println("Summation is "+ sum); //string +variable);
		System.out.println("Student ID with First Name :" +studentID+" "+firstName);
		
		//Need to create object
		LearnConcatenation obj=new LearnConcatenation();
		System.out.println("Student name is " +obj.stName);
		
		
		
	}

}
