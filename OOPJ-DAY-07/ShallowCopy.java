class ShallowCopy{
	public static void main(String args[]){
		int[] original = {1,2,3,4,5};
		int[] shallow = original;         // copies reference from reference
		 
		System.out.println(original);
		System.out.println(shallow);
		
		System.out.println(original == shallow);
		
		shallow[0] = 53 ;
		
		System.out.println("Original: ");
		for(int i: original){
			System.out.println(i);
		}
		
		System.out.println("Shallow: ");
		for(int i: shallow){
			System.out.println(i);
		}
	}
}

/*
output: 

[I@2f92e0f4   --> original
[I@2f92e0f4   --> shallow

Original:
53
2
3
4
5
Shallow:
53
2
3
4
5
*/