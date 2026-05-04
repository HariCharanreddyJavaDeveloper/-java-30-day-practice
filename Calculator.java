import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Sum"+ (a+b));
		System.out.println("Difference" + (a-b));
		System.out.println("Prodeuct"+ a*b);
		System.out.println("Quotient"+a/b);
		System.out.println("Remainder"+a%b);
		
		
		
	}

}
