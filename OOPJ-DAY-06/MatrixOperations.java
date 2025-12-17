import java.util.*;

class MatrixOperations{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] result = new int[3][3];
		
		// Matrix A
		System.out.println("Enter the elements of Matrix A: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				A[i][j] = in.nextInt(); 
			}
		}
		
		System.out.println("--------------------------------------");
		
		// Matrix B
		System.out.println("Enter the elements of Matrix B: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				B[i][j] = in.nextInt(); 
			}
		}
		
		System.out.println("--------------------------------------");
		
		// Addition
		System.out.println("Addition of Matrices: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				result[i][j] = A[i][j]+ B[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		//Subtraction
		System.out.println("Substraction of Matrices: ");
		for(int i = 0; i <3; i++){
			for(int j = 0; j < 3; j++){
				result[i][j] = A[i][j] - B[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// Multiplication 
		System.out.println("Multiplication of Matrices: ");
		for(int i = 0; i <3; i++){
			for(int j = 0; j < 3; j++){
				result[i][j] = 0;
				for(int k=0; k < 3; k++){
					result[i][j] += A[i][k] * B[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// Transpose of Matrices: 
		
		// Matrix A
		System.out.println("Transpose of Matrix A: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(A[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// Matrix B
		System.out.println("Transpose of Matrix B: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(B[j][i] + " ");
			}
			System.out.println();
		}
	}
}

/*
output:

Enter the elements of Matrix A:
1 2 3
4 5 6
7 8 9
--------------------------------------
Enter the elements of Matrix B:
9 8 7
6 5 4
3 2 1
--------------------------------------
Addition of Matrices:
10 10 10
10 10 10
10 10 10
--------------------------------------
Substraction of Matrices:
-8 -6 -4
-2 0 2
4 6 8
--------------------------------------
Multiplication of Matrices:
30 24 18
84 69 54
138 114 90
--------------------------------------
Transpose of Matrix A:
1 4 7
2 5 8
3 6 9
--------------------------------------
Transpose of Matrix B:
9 6 3
8 5 2
7 4 1

*/