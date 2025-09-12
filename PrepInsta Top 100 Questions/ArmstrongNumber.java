// Check Whether or Not the Number is an Armstrong Number
// using math.pow(): 


import java.util.Scanner;

class ArmstrongNumber{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number  = in.nextInt();
		
		if(isArmstrong(number)){
			System.out.println(number + " is Armstrong Number");
		}
		else{
			System.out.println(number + " is not Armstrong Number");
		}
		
	}
	
	static boolean isArmstrong(int num){
		int originalNum = num;
		int result = 0;
		
		int n = String.valueOf(num).length();
		
		while(num !=0 ){
			int digit = num % 10;
			result += Math.pow(digit, n);
			num /= 10;
		}
		
		return result == originalNum; 
	}
}

/*
Enter the Number:
153
153 is Armstrong Number

Enter the Number:
123
123 is not Armstrong Number
*/