class DeepCopy{
	public static void main(String args[]){
		int[] original = {1,2,3,4,5};
		int[] deep = original.clone();         // copies reference from reference
		 
		System.out.println(original);
		System.out.println(deep);
		
		deep[0] = 52 ;
		
		System.out.println("Original: ");
		for(int i: original){
			System.out.println(i);
		}
		
		System.out.println("deep: ");
		for(int i: deep){
			System.out.println(i);
		}
	}
}


/*
output: 

[I@2f92e0f4      --> original 
[I@28a418fc      --> deep

Original:
1
2
3
4
5

deep:
52
2
3
4
5
*/