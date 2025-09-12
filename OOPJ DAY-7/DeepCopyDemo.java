

class DeepCopyDemo{
	
	public static void main(String args[]){
		int[] original = {1,2,3,4,5};
		int[] deep = original.clone();
		
		System.out.println(original);
		System.out.println(deep);
		
		deep[0] = 77;
		System.out.println("original");
		for(int i : original){
			System.out.println(i);
		}
		
		System.out.println("----------");
		System.out.println("Deep");
		for(int i : deep){
			System.out.println(i);
		}
	}
}