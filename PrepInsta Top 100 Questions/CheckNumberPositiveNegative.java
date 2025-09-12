import java.util.Scanner;

// Check if a Number is Positive or Negative
class CheckNumberPositiveNegative{
	public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int num = in.nextInt();
			if(num == 0){
				System.out.println("The number is zero.");
			}
			else {					
				String number = num > 0 ? "The number is positive" : "The number is negative";
				System.out.println(number);
			}
		}
}


/*
Output: 

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java CheckNumberPositiveNegative.java
	Enter the Number:
	2
	The number is positive

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java CheckNumberPositiveNegative.java
	Enter the Number:
	0
	The number is zero.

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java CheckNumberPositiveNegative.java
	Enter the Number:
	-1
	The number is negative

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>
*/