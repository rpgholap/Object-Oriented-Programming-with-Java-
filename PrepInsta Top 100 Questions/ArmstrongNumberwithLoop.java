// Check Whether or Not the Number is an Armstrong Number
// using for loop


import java.util.Scanner;

class ArmstrongNumberwithLoop{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num  = in.nextInt();
		int sum = 0;
		int originalNo = num;
		int n = String.valueOf(num).length();
		
		while(num !=0 ){
			int digit = num % 10;
			int mul = 1;
			
			for(int i = 1; i <= n ; i++){
				mul *= digit;
			}
			sum += mul;
			num /= 10; 
		} 
		if(sum == originalNo){
			System.out.println(originalNo + " is a Armstrong Number.");
		}			
		else{
			System.out.println(originalNo + " is not an Armstrong Number.");
		}
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