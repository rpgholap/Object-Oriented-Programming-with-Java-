class TypeCasting{
	public static void main(String args[]){
		
		byte b = 127;   // 1 byte
		int i = b;      // upcasting byte(1 byte) = int (4 byte)
		
		System.out.println("Byte b : " + b);
		System.out.println("Int i: " + i);
		
		
		int j = 127;
		// error : Lossy Conversion (small size data converted into big size data)
		// byte b1 = j;  // int(4 byte) = byte (1 byte)
		byte b1 = (byte)j;   // downcasting: int(4 byte) = byte (1 byte)
		
		System.out.println("Int j: " + j);
		System.out.println("byte b1: " + b1);
	}
}