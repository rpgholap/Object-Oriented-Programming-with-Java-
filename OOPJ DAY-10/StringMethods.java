class StringMethods{
	
	 public static void main(String[] args) {
		 
		// Strings are Immutable:
        String text = "JAVA";
//        text.charAt(0) = 'V';  //error: unexpected type ---> compile-time error   
		
		// String Methods: 
		
		String str = "Hello Junnar";
		
		// length(): length of the String
        System.out.println("Length of String: " + str.length()); 
		
		//toLowerCase : convert into lowercase
		System.out.println("Changed String : " + str.toLowerCase());
		
		// toUpperCase : convert into uppercase
        System.out.println("Changed String : " + str.toUpperCase());
		
		 // charAt(index) → character at a specific index
        System.out.println("charAt(1): " + str.charAt(1));
		
		// equals() → checks if two strings are equal
        System.out.println("Checks for equal Strings: " + str.equals("Hello Junnar"));
			
		// contains() → checks if substring is present
        System.out.println("contains 'World': " + str.contains("World"));
		
		// indexOf() → finds index of first occurrence
        System.out.println("indexOf('J'): " + str.indexOf('J'));
		
		// trim() → removes leading and trailing spaces
        String strWithSpaces = "   Hello Shivjanmabhoomi!   ";
        System.out.println("trim(): '" + strWithSpaces.trim() + "'");
		
		//String substring(int i) Method: returns the substring from the ith index character to end.
		System.out.println("Substring(): " + str.substring(7));
		System.out.println("Returns the substring in given index: " + str.substring(7, 12));
		
	
		// concat(): specified string str to the end of the original string
		String str1 = "OS";
		String str2 = " & OOPJ";
		 
		String result = str1.concat(str2);
		System.out.println("Original str1: " + str1);
        System.out.println("Original str2: " + str2);
        System.out.println("After concatenation: " + result);
		
		
		//String concat( String str) Method: appends the given string to the end of the current string
		System.out.println(str.concat("!!!"));
		
		// boolean equals(Object otherObj) Method: compares this string to the specified object.
		System.out.println(str.equals("Hello Junnar"));
		
		
		//String replace(char oldChar, char newChar) Method: returns a new string where all instances of oldChar are replaced by newChar.
		System.out.println(str.replace('l', 'e'));
		
		
		// char[] toCharArray() Method: converts the string into a new character array.
		String str11 = "Shivjanmabhoomi";
        char[] chars = str11.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");
        }
		
		// toString(): to represent any object as a readable string.
        String result1 = str.toString();
        System.out.println(result1); 
        System.out.println(str == result1); 
	}
}


/*
Length of String: 12
Changed String : hello junnar
Changed String : HELLO JUNNAR
charAt(1): e
Checks for equal Strings: true
contains 'World': false
indexOf('J'): 6
trim(): 'Hello Shivjanmabhoomi!'
Substring(): unnar
Returns the substring in given index: unnar
Original str1: OS
Original str2:  & OOPJ
After concatenation: OS & OOPJ
Hello Junnar!!!
true
Heeeo Junnar
S h i v j a n m a b h o o m i
true
*/