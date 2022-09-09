package com.loopDec.pll;

import java.util.Scanner;

import com.loopDec.bll.CountDigit;

public class TestCountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			CountDigit c1 = new CountDigit();
			System.out.println("WELCOME TO JAVA WORLD");
			System.out.println("**********************************************");
			
			System.out.println("Enter positive number");
			int num=sc.nextInt();
			System.out.println("**********************************************");
			if(num>=0) {
				System.out.println("Number of digit is :"+c1.countDigit(num));
			}
			else {
				System.out.println("Invilide input");
			}
		sc.close();
		System.out.println("**********************************************");
	}

}