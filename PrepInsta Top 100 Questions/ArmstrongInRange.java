// Find the Armstrong Numbers in a given Range using Java

import java.util.Scanner;

class ArmstrongInRange{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Start: ");
		int start = in.nextInt();
		System.out.println("End: ");
		int end = in.nextInt();
		System.out.println("The Armstrong Number between " + start +  " and " + end + " are: " );
		for(int num = start; num <= end ; num++){
			int sum = 0;
			int originalNum = num;
			
			int len = String.valueOf(num).length();
			
			int temp =  num;
			while(temp != 0){
				int rem = temp % 10;
				sum += Math.pow(rem, len);
				temp /= 10;
			}
			
			if(sum == originalNum){
				System.out.println(originalNum);
			}
			
		}
		
	}
}


/*
output:
Start:
10
End:
1000
The Armstrong Number between 10 and 1000 are:
153
370
371
407
*/