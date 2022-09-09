package com.loopDec.bll;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sumeven=0;
		int sumodd=0;
		System.out.println("WELCOME TO JAVA WORLD");
		System.out.println("**********************************************");
		System.out.println("Enter two positive Number and number1<number2:");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		System.out.println("**********************************************");
		if(firstNum<secondNum && firstNum>=0) {
			do {
				if(firstNum%2==0) {
					sumeven=sumeven+firstNum;
					System.out.println("even----> "+firstNum);
				}
				else {
					System.out.println("odd--> "+firstNum);
					sumodd=sumodd+firstNum;
				}
				firstNum++;
			}
			while(firstNum<=secondNum);
			
			System.out.println("\n");
			System.out.println("**********************************************");
			System.out.println("Sum of all even Number ="+sumeven);
			System.out.println("**********************************************");
			System.out.println("Sum of all odd Number ="+sumodd);
			System.out.println("**********************************************");
		}
		else {
			System.out.println("invilide input");
		}
		
		sc.close();


	}

}
