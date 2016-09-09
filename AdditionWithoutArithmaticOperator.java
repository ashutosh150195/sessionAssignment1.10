package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionWithoutArithmaticOperator {

	private static BufferedReader br ;
	private static String[] input ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			input = br.readLine().split(" ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(addition(Integer.parseInt(input[0]) , Integer.parseInt(input[1])));
	}

	private static int addition(int parseInt, int parseInt2) {
		// TODO Auto-generated method stub
		int carry = 0 ;
		while(parseInt2 != 0){
			carry = parseInt & parseInt2 ;
			parseInt ^= parseInt2 ;
			parseInt2 = carry << 1 ;
		}
		return parseInt;
	}

}
