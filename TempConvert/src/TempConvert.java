/*
 * Justin Feng
 * Period 1
 * Temperature Conversion
 */
public class TempConvert { //converts -32 fahrenheit to 0 celsius

	public static void main(String[] args) {
		int F = -32; //assigned variable F for Fahrenheit with a value of -32
		double C = (double)(5/9)*(F-32); //assigned variable C for Celsius with algorithm to convert from Fahrenheit to Celsius
		System.out.println(F + "degrees Fahrenheit is "+  C + " degrees Celsius."); //print out the final results of the conversion

	}

}
