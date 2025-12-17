//REturning array from methods
import java.util.*;

class ArrayDemo10
{
	static int[] getArray(){
		return new int[]{1,2,3,4,5};
	}
	
	public static void main(String args[]){
		
	int[] arr = getArray();//{1,2,3,4,5}
		
		for(int x:arr){
			System.out.println(x);
		}
		
		
		
		
	}
}