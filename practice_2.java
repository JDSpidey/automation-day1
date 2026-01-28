package practice;

import java.util.Scanner;

public class practice_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number: ");
	int number = sc.nextInt();
	if(number < 100) {
		System.out.println("You are lucky ");
	}
	else if(number > 100 ) {
		System.out.println("You are unlucky");
	}
	else {
		System.out.println("You are born to be wasted");
	}
}
}