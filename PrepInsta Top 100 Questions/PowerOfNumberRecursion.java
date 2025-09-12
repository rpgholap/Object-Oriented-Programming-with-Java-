// Find the Power of a Number using recusive approch

import java.util.Scanner;

class PowerOfNumberRecursion{
	
	static int Power(int Num, int Power){
		if(Power == 0){
			return 1;
		}
		else{
			 return Num  * Power(Num, Power - 1);
		}
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number " );
		int Num = in.nextInt();
		
		System.out.println("Enter the power: ");
		int Power = in.nextInt();
		
		int result = Power(Num, Power);
		
		System.out.println(Num + "^" + Power + " = " + result); 
}
}

/*
Output: 
	Enter the Number
	2
	Enter the power:
	5
	2^5 = 32
*/