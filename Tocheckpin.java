//to check the pin weather the no.is matched or not..
package com.loopDec.bll;

import java.util.Scanner;

public class Tocheckpin {
	public static final int pin=2345;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO JAVA WORLD");
		System.out.println("**********************************************");
		int epin;
		int count=0;
		do {
			System.out.println("Enter your Pin");
			epin = sc.nextInt();
			if(epin==pin) {
				System.out.println("<---welcome back--->");
				break;
			}
			else {
				
				if(count<2) {
					System.out.println("<---Incorrect pin 'please Try again'--->");
				}
				count++;
				
			}
			System.out.println("**********************************************");
		}while(count<3);
		if(count==3) {
			System.out.println("\n");
			System.out.println("<---Incorrect pin attempt exceded'--->");
			System.out.println("<----Sorry you have been locked out---->");
		}
		sc.close();
	}

}
