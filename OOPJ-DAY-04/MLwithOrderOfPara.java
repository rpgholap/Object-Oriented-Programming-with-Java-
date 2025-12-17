//Changing order of parameters

class MLwithOrderOfPara{
	void emp(String name, int roll_no){
		System.out.println("Name: " + name + ", Roll No: " + roll_no);
	}
	
	 void emp(int roll_no, String name){
		 System.out.println("Roll No: " + roll_no + "Name: " + name);
	}
	
}

class OrderofPara{
	public static void main(String args[]){
		MLwithOrderOfPara obj = new MLwithOrderOfPara();
		
		obj.emp("Rutuja", 1);
		obj.emp(1, "Rutuja");
	}
}