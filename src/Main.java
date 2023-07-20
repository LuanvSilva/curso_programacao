import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c ){
			System.out.print("Higher = " + a);

		}else if (b > c ){
			System.out.print("Higher = " + b );

		}else{
			System.out.print("Higher = " + c);
		}
		
		sc.close();
		

		// String original = "Luan LUAN silva";
		// String s1 = original.toLowerCase();
		// System.out.printf(s1);

		// Scanner sc = new Scanner(System.in);
		// String x = sc.next();
		// System.out.println("Voce digitou :" + x);
		// sc.close();

		// String product1 = "Computer";
		// String product2 = "Office desk";
		// int age = 30;
		// int code = 5290;
		// char gender = 'F';
		// double price1 = 2100.0;
		// double price2 = 650.0;
		// double measure = 53.234567;

		// System.out.printf("%s , which price is %.2f $%n", product1, price1);
		// System.out.printf("%s , which price is %.2f $%n", product2, price2);
		// System.out.printf("Record %d , years old , code %d and gender: %c %n", age, code, gender);
		// System.out.printf("Measue with eight decimal places %f %n", measure);
		// System.out.printf("Rouded (three decimal places ): %.3f%n", measure);
		// Locale.setDefault(Locale.US);
		// System.out.printf("US decimal point: %.3f%n", measure);


	}

}
