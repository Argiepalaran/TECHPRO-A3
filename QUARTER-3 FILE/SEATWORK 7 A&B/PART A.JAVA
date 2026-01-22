// PART A.
public class Main {
	public static void main(String[] args) {
		int number1 = 20;
		int number2 =0;
		
		try { 
		int result = number1/ number2; // causes error
		System.out.println ("Result:" + result);
		} catch (ArithmeticException e) {
		    System.out.println ("Build-in Exception: Cannot divide by zero");
		}
		
		System.out.println("Program continues running...");		
	}
}
