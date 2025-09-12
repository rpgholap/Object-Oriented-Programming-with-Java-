// Changing Data Types of the Arguments

class MLwithDiffTypeofPara {
	
	int prod(int x, int y, int z) {
		int prod1 = x * y * z;
		return prod1;
	}
	
	double prod(double x, double y, double z) {
		double prod2 = x * y * z;
		return prod2;
	}
}

class TypeofPara {
	public static void main(String args[]) {
		MLwithDiffTypeofPara m1 = new MLwithDiffTypeofPara();
		
		int intResult = m1.prod(1, 2, 3); // call int version
		System.out.println("Int Product: " + intResult);
		
		double doubleResult = m1.prod(1.0, 2.0, 3.0); // call double version
		System.out.println("Double Product: " + doubleResult);
	}
}


/*
Output:
	Int Product: 6
	Double Product: 6.0
*/
