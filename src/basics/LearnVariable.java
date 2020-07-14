package basics;

public class LearnVariable {
	
	//variable: variable is a container which hold some value
		//Left side= Right side
		//Variable syntax: DataType VariableName = variable Value
		
		//Variable Declare 
		int price;  //Global non static variable
		
		//Variable Declare and Initialized
		int size = 18;  // = Assignment operator
		
		
		int a =5; //global variable
		// int means integer numeric value
		// a is the name of variable
		// = means assign
		//5 is the valueOf Variable
		
		
		int b = 6; //global variable
		
		//variable name start with small letter
		
		static int age = 24; // global variable
		
		
		String name= "Lem Lem";
		
		//type of variable;
		//Global Variable Instance variable : outside of the method but inside of a class
		

		public static void main(String[] args) {
			//local variable
			int e=60;
			//create object
			LearnVariable obj = new LearnVariable();
			obj.price=300;
			System.out.println(obj.price);
			System.out.println(LearnVariable.age);
			System.out.println(age);
			//To call Any property: variable/method
			//Create Object then call by object name
			//Use static then call only by class name
			
			
			
			obj.name="Mateen Davis";
			System.out.println(obj.name);
			
			
		}
	}



