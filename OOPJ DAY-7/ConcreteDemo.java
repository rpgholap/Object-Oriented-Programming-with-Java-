
class Book{
	private String title;
	
	Book(String title){
		this.title = title;
	}
	
	void readbook(){
		System.out.println("Read method: read()");
	}
}
class ConcreteDemo{
	
	public static void main(String args[]){
		Book b1 = new Book("The Alchemist");
		b1.readbook();
		
	}
}