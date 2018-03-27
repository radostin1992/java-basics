
public class App {

	public static void main(String[] args) {
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;

		float floatValue = 8834.3f;
		double doubleValue = 32.4;

		System.out.println("min:" + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE);
		System.out.println("min:" + Short.MIN_VALUE + " max: " + Short.MAX_VALUE);
		System.out.println("min:" + Integer.MIN_VALUE + " max: " + Integer.MAX_VALUE);
		System.out.println("min:" + Long.MIN_VALUE + " max: " + Long.MAX_VALUE);
		System.out.println("min:" + Float.MIN_VALUE + " max: " + Float.MAX_VALUE);
		System.out.println("min:" + Double.MIN_VALUE + " max: " + Double.MAX_VALUE);

		intValue = (int) longValue;

		System.out.println(intValue);

		doubleValue = intValue;
		System.out.println(doubleValue);

		intValue = (int) floatValue;
		System.out.println(intValue);
		// The following won't work as we expected.
		// 128 is too big for a byte.
		byteValue = (byte) 128;
		System.out.println(byteValue);
	}

}
