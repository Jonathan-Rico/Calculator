import java.util.Scanner;
public class Calculator {
	public static void main(String [] args){
	
		System.out.printf("Hello, please enter two integer numbers below.\n");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
	
		System.out.printf("Please enter Add ,  Subtract , Multiply or Divide for the program to perform the arithmetic function of your choice with the numbers given.\n");
		String function = input.next();
		
		if (function.equals("Add")) {
			int sum = x+y;
			System.out.printf("The result is %d", sum);
			}
		else if (function.equals("Subtract")){
			int subtract = x-y;
			System.out.printf("The result is %d", subtract);
			}
		else if (function.equals("Multiply")){
			int multiply = x*y;
			System.out.printf("The result is %d", multiply);
			}
		else if (function.equals("Divide")){
			int divide = x/y;
			System.out.printf("The result is %d", divide);
		}
	}
}

