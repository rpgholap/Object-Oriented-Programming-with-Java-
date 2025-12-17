

class ShallowCopyDemo{
	
	public static void main(String args[]){
		int[] original = {1,2,3,4,5};
		int[] shallow = original;
		
		System.out.println(original);
		System.out.println(shallow);
		
		shallow[0] = 7;
		System.out.println("original");
		for(int i : original){
			System.out.println(i);
		}
		
		System.out.println("----------");
		System.out.println("shallow");
		for(int i : shallow){
			System.out.println(i);
		}
	}
}