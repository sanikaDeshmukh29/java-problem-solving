package coding_challenges;

import java.util.Scanner;

public class ATMMoneyPattern {
	
	public static void main(String[] args) {
		
		int twoThousand, fiveHundred, twoHundred, hundred = 0;
		
		int amount;
		int i;
		
		
		System.out.println("Enter the amount : ");
		Scanner sc = new Scanner(System.in);
		
		amount = sc.nextInt();
		i = amount;
		if(amount >= 2000) {
			twoThousand = amount / 2000;
			System.out.println("2000"+ " x "+twoThousand + " = " + 2000 * twoThousand);
			amount = amount % 2000;
		}else {
			System.out.println("2000"+ " x "+0 + " = " + 0);
		}
		
		if(amount >= 500) {
			fiveHundred = amount / 500;
			System.out.println("500"+ " x "+fiveHundred + " = " + 500 * fiveHundred);
			amount = amount % 500;
		}else {
			System.out.println("500"+ " x "+0 + " = " + 0);
		}
		
		if(amount >= 200) {
			twoHundred = amount / 200;
			System.out.println("200"+ " x "+twoHundred + " = " + 200 * twoHundred);
			amount = amount % 200;
		}else {
			System.out.println("200"+ " x "+0 + " = " + 0);
		}
		
		if(amount >= 100) {
			hundred = amount / 100;
			System.out.println("100"+ " x "+hundred + " = " + 100 * hundred);
			amount = amount % 100;
		}else {
			System.out.println("100"+ " x "+0 + " = " + 0);
		}
		
		System.out.println("Total Amount : " + i);
		
	}

}
