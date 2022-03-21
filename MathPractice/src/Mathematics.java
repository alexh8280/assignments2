import java.util.Scanner;

public class Mathematics {

	public static void main(String[] args) {
		
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double y = userInput.nextDouble();
		System.out.println("Enter the second number");
		double x = userInput.nextDouble();
		
		
		System.out.println("The maximum number of " + x + "and " + y + " is " + Math.max(x, y));
		
		System.out.println("Sqaure root of " + y + " is " + Math.sqrt(y));
		
		System.out.println("Power of " + x + "and " + y + " is " + Math.pow(x, y));
		
		System.out.println("Logarithm of " + x + " is " + Math.log(x));
		System.out.println("Logarithm of " + y + " is " + Math.log(y));
		
		System.out.println("log10 of " + x + "is " + Math.log10(x));
		System.out.println("log10 of " + y + "is " + Math.log10(y));
		
		System.out.println("log1p of " + x + " is " + Math.log1p(x));
		System.out.println("log1p of " + y + " is " + Math.log1p(y));
		
		System.out.println("exp of " + x + " is " + Math.exp(x));
		
		System.out.println("expm1 of " + x + " is " + Math.expm1(x));
		
		userInput.close();
		
	}

}
