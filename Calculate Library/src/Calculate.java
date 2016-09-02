
public class Calculate {
	public static double square(double number){
		return (number * number);
	}
	public static double cube(double number){
		return (number * number * number);	
	}
	public static double average(double number1, double number2){
		return (number1 * number2 / 2);	
	}
	public static double average(double number1, double number2, double number3){
		return (number1 * number2 * number3 / 3);	
	}
	public static double toDegrees(double radians){
		return (radians * 180 / 3.14159);	
	}
	public static double toRadians(double degrees){
		return (degrees * 3.14159 / 180);	
	}
	public static double discriminant(double a, double b, double c){
		return (b*b - 4*a*c);	
	}
	public static String toImproperFrac(double wholenum, double nominator, double denominator){
		String fraction = (wholenum * denominator + nominator) + "/" + denominator;
		return fraction;	
	}
	public static String toMixedNum(double nominator, double denominator){
		int wholeNum = (int)nominator/ (int)denominator;
		nominator = (int) nominator % (int) denominator;
		String MixedNum = wholeNum + " " + nominator + denominator;
		return MixedNum;	
	}
	public static String foil(int first, int second, int third, int fourth, String variable){
		int a = first * third;
		int b = second * third + first * fourth;
		int c = second * fourth;
		String function = a + variable + "^2 +" + b + variable + " + " + c;
		return function;	
	}
	public static boolean isDivisibleBy(int x, int y){
		if (x % y == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
