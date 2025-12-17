
import java.util.*;
class ArrayDemo5
{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int r = sc.nextInt();
		
		int arr[][] = new int[r][];//Jagged array(rows without fixed columns)
		
		//Input:
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter no. of cols:"+ i + ":");
			int cols = sc.nextInt();
			arr[i] = new int[cols];
			
			for(int j=0;j<arr[i].length;j++){
			System.out.println("Enter elem:");
			arr[i][j] = sc.nextInt();
			}
		}			
		
		//Print array	
		for(int ar[] : arr){
			for(int x : ar){
				System.out.print(" "+x);
			}
			System.out.println();
		
		}
		
	
			
		
	}
}