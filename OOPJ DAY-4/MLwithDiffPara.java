// method overloading by defining multiple sum() methods with different parameter types and counts.

class MLwithDiffPara{
		int sum(int x, int y){
			return x+y;
		}
		int sum(int x, int y, int z){
			return x+y+z;
		}
		
		double sum(double x,double y){
			return x+y;
		}
		
		public static void main(String args[]){
			MLwithDiffPara s = new MLwithDiffPara();
			System.out.println(s.sum(10,120));
			System.out.println(s.sum(10,20,30));
			System.out.println(s.sum(10.20, 20.24));	
		}
		
}