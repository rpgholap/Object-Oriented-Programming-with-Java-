import java.util.*;

class JaggedMatrix{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int[][] jagged = new int [3][];
		
		//define each row dynamically
		System.out.println("Enter the number of elements for each row: ");
		for(int i =0; i < jagged.length; i++){
			System.out.println("Row " + "length: ");
			int length = in.nextInt();
			jagged[i] = new int[length];
		}
		
		// input elements
        System.out.println("\nEnter elements of the jagged matrix:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                jagged[i][j] = in.nextInt();
            }
        }

        // Print the jagged matrix
        System.out.println("\nJagged Matrix:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
	}
}



/*
Output:

Enter the number of elements for each row:
Row length:
3
Row length:
2
Row length:
3

Enter elements of the jagged matrix:
Element [0][0]: 1
Element [0][1]: 2
Element [0][2]: 3
Element [1][0]: 33
Element [1][1]: 22
Element [2][0]: 11
Element [2][1]: 12
Element [2][2]: 13

Jagged Matrix:
1 2 3
33 22
11 12 13

*/