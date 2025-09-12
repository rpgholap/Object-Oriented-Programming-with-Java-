interface Book{
	void readbook();
}

class Anonymous{
	public static void main(String args[]){
		// Anonymous class implementing book interface
		
		// Syntax of Anonymous class
		// Book b1 = new Book(){};              // created class at runtime 
		
		Book b1 = new Book(){
			
		// method implementation
		@Override     // annotation
		
		public void readbook(){
			System.out.println("Read method: "); 
		}
		};
		
		b1.readbook();
	}
}

/*
output:
Read Method: 
*/