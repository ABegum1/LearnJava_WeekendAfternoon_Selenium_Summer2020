package basics;

public class UseAccessModifier {
	

	
		
		//Access Modifier / Access Specifier: where you can access and where you can not access
		//public - From any package and any class you can take access
		//private - From same class only
		//protected - you can access from within same package any class  
		//default - Same as public
	
	public static void main(String[] args) {
		System.out.println();
	
		}
	private static void display() {
		System.out.println("Display");
	}
	
	public static void TVdisplay() {
		System.out.println("TV Display");
	}

	protected static void mobileDisplay() {
		System.out.println("Mobile Display");
	}
	

	
	
	


}