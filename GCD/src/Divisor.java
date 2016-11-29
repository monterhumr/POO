//WSQ06_Greatest Common Divisor

import java.util.Scanner;

public class Divisor{
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);

		System.out.println("Give me the first number:");
		int a = num.nextInt();
		System.out.println("Give me the second number:");
		int b = num.nextInt();
		int c=0;

		if(a > b){
			c = b;
		}else{
			c = a;
		}
		
		while((a % c != 0)||(b % c != 0)){
			c--;
		}
		
		System.out.println("The greatest common divisor for numbers "+a+" and "+b+" is: "+c);
	}

}