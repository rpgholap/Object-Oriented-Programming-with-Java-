import java.util.Scanner;
class scannerDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = i + j;
		System.out.println("The sum is: " + k);
	}
}