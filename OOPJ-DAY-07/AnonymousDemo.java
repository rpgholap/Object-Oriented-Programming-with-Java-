
interface Book{

	void readbook();
}
public class AnonymousDemo{
	
	public static void main(String args[]){
		//Anonymous class implementing Book interface
		Book b1 = new Book(){
			//method implementation
			@Override //annotation	
			public void readbook(){
				System.out.println("Read method: read()");
			}
			
		};
		
		
		b1.readbook();
		
	}
}