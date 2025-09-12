
//PArent class
class Parent{
	int a=10;
	int b=20;
	
	void PrintData(){
		System.out.println("Parent class : P");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	void m1(){
		System.out.println("m1() : P");
	}
	
}
//Child class : inherit Parent class
class Child extends Parent{
	int x =30;
	void PrintChildData(){
		System.out.println("Childclass : C1");
		System.out.println("x="+x);
	}
	void m2(){
		System.out.println("m2() : P");
	}
}

//Driver class : Main()
public class SingleInheritanceDemo1{
	
	void m3(){
		System.out.println("m3() : Demo");
	}
	
	public static void main(String args[]){
		
		//Child class : refernce: object
		Child c = new Child();
		//Child class method
		c.PrintChildData();//Access through child class refernce
		//Parent class
		c.PrintData();//Access through child class refernce
		c.m2();
		c.m1();
				
		
		Parent p = new Parent();
		System.out.println("a="+p.a);//10
		p.PrintData();
		//p.PrintChildData();//Error
		p.m1();
		//p.m2();//Error
		
		
		Parent p1 = new Child();
		p1.m1();
		p1.m2(); 
		
		//Child c1 = new Parent();
		//c1.m1();
		//c1.m2();
		//c1.m3();//CTE: Error
		
	}
}