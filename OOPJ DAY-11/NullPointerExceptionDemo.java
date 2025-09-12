class A{
	void m1(){
		System.out.println("m1() : executed");
	}
}
class NullPointerExceptionDemo{
	
	
	public static void main(String[] args){
		
		System.out.println("1: start");
		A a1 = null;
		try{
			a1.m1();//Exception throw
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Null ko koun invoke karta hai!!!!");
		}finally{
			System.out.println("REsource Release karo!!!");
		}
		System.out.println("100: Completed");
		
		
		
		
		
	}

}

