/*
Problem 5: Online Shopping
Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price).
The system needs to handle invalid quantities and accessing non-existent products.
Task: Create an order processing method that handles multiple exception types.
Sample Input:
0
3
299.99 499.99 199.99
5
Expected Output:
Arithmetic Exception caught
or
Array Index Exception
*/

import java.util.Scanner;

class OnlineShopping{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Index of product: ");
		int ProdIndex = in.nextInt();
		
		
		System.out.println("Enter quantity:");
        int quantity = in.nextInt();
		
		System.out.println("Enter the number of products: ");
		int n = in.nextInt();
		
		double[] price = new double[n];
		System.out.println("Enter product prices:");
		for(int i = 0; i < n; i++){
			price[i] = in.nextDouble();
		}
		
		try{
			double unitPrice = price[ProdIndex];
			
			try{
				if(quantity <= 0 ){
					throw new ArithmeticException();
				}
				double totalPrice = quantity * unitPrice;
				System.out.println("Total Price: " + totalPrice);
			} catch(ArithmeticException e){
				System.out.println("Arithmetic Exception caught");
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index Exception.");
		} //catch(InputMismatchException e){
				// System.out.println("Input Exception ");
			// }
			finally{
				in.close();
			}
			
			
	}
}


/*
output:

Enter the Index of product:
5
Enter quantity:
4
Enter the number of products:
3
Enter product prices:
222
222
222
Array Index Exception.

-----------------------------------------

Enter the Index of product:
1
Enter quantity:                          --> Exception: quantity is 0 or negative.
0
Enter the number of products:
2
Enter product prices:
111
112
Arithmetic Exception caught
*/