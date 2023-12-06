package com.dp;

public class Calculation {

	public static void main(String[] args) {
		/*IArithmatic ar = (int a, int b)->{
			int c = 0;
			c = a*b;
			System.out.println(c);
			return c;
		};*/
		
		/*IArithmatic ar = (int a, int b)->{
			System.out.println(a*b);
			return a*b;
		};*/
		
		//IArithmatic ar = (int a, int b)->{ return a*b ;};
		
		IArithmatic ar = (a, b)-> a*b ;
		
		System.out.println(ar.add(5, 4));
	}

}
