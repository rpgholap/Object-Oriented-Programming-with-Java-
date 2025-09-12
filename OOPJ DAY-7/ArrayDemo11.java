//Cloning of an array
//2 ways: 1.Deep copy & 2. Shallow copy

class ArrayDemo11{
	
	public static void main(String args[]){
		
		//1d Array
		int[] arr = {1,2,3};
		int[] clone = arr.clone();
		System.out.println(arr == clone);
		System.out.println("arr="+arr);
		System.out.println("clone="+clone);
		System.out.println("========================");
		//2d Array
		int[][] matrix = {{1,2},{3,4}};
		int[][] copy = matrix.clone();
		System.out.println(matrix[0] == copy[0]);
		
	}
}