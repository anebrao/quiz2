package Quiz2;

import java.util.Scanner;

public class Finance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tuition,
			percentage,
			total = 0;
		
		System.out.printf("Enter initial tuition cost first year: ");
		tuition = sc.nextDouble();
		
		System.out.printf("Enter percentage increase in tuition for each year: ");
		percentage = sc.nextDouble();
		
		sc.close();
		
		for (int i = 0; i <= 3; i++) {
			total += (tuition * Math.pow(1 + percentage, i));
		}
		
		System.out.printf("Total tuition for all 4 years: $%.2f", total);
	}
}
		
