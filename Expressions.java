package com.java;

public class Expressions {
	
	private static int a = 20, b = 10 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b= a-- - --a;
		int c=a--;
		int d=a>>2;
		int e=a&b;

		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
	}

}
