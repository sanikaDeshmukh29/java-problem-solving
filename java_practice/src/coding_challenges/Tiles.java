package coding_challenges;

import java.util.Scanner;

public class Tiles {

	public static void main(String[] args) {
		int red, blue, green = 0;
		int number;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		
		if(number >= 5) {
			red = number / 5;
			number = number  % 5;
			System.out.println("Red : " + red);
		}else {
			System.out.println("Red : " + 0);
		}
		
		if(number >= 2) {
			blue = number / 2;
			number = number  % 2;
			System.out.println("Blue : " + blue);
		}else {
			System.out.println("Blue : " + 0);
		}
		
		if(number >= 1) {
			green = number / 1;
			number = number  % 1;
			System.out.println("Green : "+ green);
		}else {
			System.out.println("Green : " + 0);
		}
		
		
	}
	
	
}
