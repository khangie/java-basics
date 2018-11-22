package com.primitivedatatypes;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		// Integer (width of 32)
		int myMinValue = -2147483648;
		int myMaxValue = 2147483647;

		// Byte (width of 8)
		byte myByteValue = -1;

		// Short (width of 16)
		short myShortValue = 32767;

		// Long (width of 64)
		long myLongValue = 100L;
		
		// Float
		float myFloatValue = 1.1f;
		
		// Double
		double myDoubleValue = 5.4d;
		
		// Char
		char myChar = 'D';
		
		// Char (unicode)
		char unicodeChar = '\u00A9';
		
		// Boolean
		boolean myBoolean = true;
		
		// String
		String myString = "This is a string";
		
		// Examples
		short shortTotal = (short) (myByteValue + myShortValue + myMinValue);
		System.out.println("shortTotal: " + shortTotal);

		System.out.println("unicodeChar = " + unicodeChar);
		
	}

}
