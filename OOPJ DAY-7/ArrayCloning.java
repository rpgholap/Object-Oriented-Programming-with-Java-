class ArrayCloning{
	
	public static void main(String args[]){
		// 1D array:
		int[] arr = {1,2,3};            // arr --> 1  2  3
		int[] clone = arr.clone();  	// clone --> 1  2  3
		
		System.out.println(arr == clone);    // checks for reference  
		
		System.out.println("arr " + arr);
		System.out.println("clone " + clone);
		
		System.out.println("---------------------");
		
		// 2D array:
		int[][] matrix = {{1,2},{3,4}};
		int[][] copy = matrix.clone();
		System.out.println(matrix[0] == copy[0]);
		
	}
}

/*
output:
false
arr [I@2f92e0f4
clone [I@5674cd4d
---------------------
true

*/