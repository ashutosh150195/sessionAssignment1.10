package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swaps {
	
	private static BufferedReader br ;
	private static String number1 ; 
	private static String number2 ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		
		number1 = br.readLine();
		number2 = br.readLine();
		
		int a = Integer.parseInt(number1);
		int b = Integer.parseInt(number2);
		
		System.out.println("Before Swaping :"+a+" "+b);
		swapingNumber(a , b);
	}

	private static void swapingNumber(int a, int b) {
		// TODO Auto-generated method stub
		a = a^b ;
		b = a^b ;
		a = a^b ;
		
		System.out.println("After Swaping :"+a+" "+b);
	}

}
