package com.loopDec.bll;

	public class CountDigit {
			int n;
			int count=0;
			public int countDigit(int n) {
				if(n>=0) {
					while(n!=0) {
						n=n/10;
						count++;
					}
					
				}
				return count;
			}
	}
