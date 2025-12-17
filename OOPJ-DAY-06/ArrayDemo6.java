
import java.util.*;
class ArrayDemo5
{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows:");//Row ka no bataya
		int r = sc.nextInt();
		
		int arr[][] = new int[r][];//Jagged array(rows without fixed columns)
		
		//Input:
		for(int i=0;i<arr.length;i++){//based on number of rows
			System.out.println("Enter no. of cols:"+ i + ":");//Col 
			int cols = sc.nextInt();//Input col no for each row
			arr[i] = new int[cols];//col = Memory allocate
			
			for(int j=0;j<arr[i].length;j++){
			System.out.println("Enter elem:");//Entry point for all col elements
			arr[i][j] = sc.nextInt();//value for col inputs
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