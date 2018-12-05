package exponentRecursion;
import java.util.Scanner;

public class Exponents {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String value, exponent;
		double dblVal, answer;
		int intVal;
		
		System.out.println("Please provide the number you wish to use as the base: ");
		value = input.nextLine();
		dblVal = Double.parseDouble(value);
		
		System.out.println("Please provide the exponent you wish to use: ");
		exponent = input.nextLine();
		intVal = Integer.parseInt(exponent);
		
		answer = toThePower(dblVal, intVal);
		
		System.out.println(answer);
		
		input.close();
		
	}

	public static double toThePower(double num, int exp) {
		if(exp == 0)
			return 1.;
		if(exp < 0)
			return 1. / toThePower(num, -exp);
		else
			return num * toThePower(num, exp - 1);
	}
}

