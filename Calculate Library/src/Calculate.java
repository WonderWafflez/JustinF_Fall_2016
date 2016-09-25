

/*
 * 
 * Calculate Library
 * Justin Feng
 * Period: 1
 * Mrs. Dreyer
 * 
 */
public class Calculate {
	public static double square(double number){			//squares a number
		return (number * number);
	}
	public static double cube(double number){			//cubes a number
		return (number * number * number);	
	}
	public static double average(double number1, double number2){			//finds the average of two numbers
		return (number1 * number2 / 2);	
	}
	public static double average(double number1, double number2, double number3){			//finds the average of three numbers
		return (number1 * number2 * number3 / 3);	
	}
	public static double toDegrees(double radians){			//converts from radians to degrees
		return (radians * 180 / 3.14159);	
	}
	public static double toRadians(double degrees){			//converts from degrees to radians
		return (degrees * 3.14159 / 180);	
	}
	public static double discriminant(double a, double b, double c){		//finds the discriminant using the coefficients of a quadratic formula
		return (b*b - 4*a*c);	
	}
	public static String toImproperFrac(double wholenum, double nominator, double denominator){			//converts a mixed number to an improper fraction
		String fraction = (int)(wholenum * denominator + nominator) + "/" + (int)denominator;			//concatenation to form improper fraction
		return fraction;	
	}
	public static String toMixedNum(double nominator, double denominator){			//converts an improper function to a mixed number
		int wholeNum = (int)nominator/ (int)denominator;							//concatenation to form mixed numbers
		nominator = (int) nominator % (int) denominator;
		String MixedNum = wholeNum + " " + (int) nominator +"/"+ (int) denominator;
		return MixedNum;	
	}
	public static String foil(int first, int second, int third, int fourth, String variable){			//takes four integers and a string, and converts that into a quadratic formula
		int a = first * third;																			//first values
		int b = second * third + first * fourth;														//outer values plus inner values
		int c = second * fourth;																		//last values
		String function = a + variable + "^2 + " + b + variable + " + " + c;							//concatenation to form quadratic function
		return function;	
	}
	public static boolean isDivisibleBy(int x, int y){			//checks whether x is divisible by y
		if (y == 0){											//does not allow numbers to be divided by 0
			throw new IllegalArgumentException("Numbers cannot be divided by 0. Please choose another number to be the divisor.");
		}
		if (x % y == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static double absValue(double x){			//returns the absolute value of the input
		double answer;
		if (x >= 0){
			answer =  x;
		}
		else{
			answer = (x - (2 * x));						//converts a negative x value into a positive one
		}
		return answer;
	}
	public static int max(int x, int y){			//finds the bigger value between x and y
		if (x > y){
			return x;
		}
		else{
			return y;
		}
	}
	public static double max(double x, double y, double z){			//finds the bigger value between x, y, and z
		double answer = 1;
		if (x > y){
			if (x > z){
				answer = x;
			}
			else{
				answer = z;
			}
		}
		if (y > x){
			if (y > z){
				answer = y;
			}
			else{
				answer = z;
			}
		}
		return answer;
	}
	public static int min(int x, int y){			//finds the smallest value between x and y
		if (x < y){
			return x;
		}
		else{
			return y;
		}
	}
	public static double round2(double x){			//rounds a double to the hundredth place
		x = x*1000;									//extracts the decimal point
		x = (int) x;								//converts to int to get rid of excess digits
		x += 5;										//adds 5 to ensure proper rounding of the hundredth place
		x = x/10;
		x = (double) x;								//returns x into an integer
		x = x/100;									//returns the decimal point
		return x;
	}
	public static double exponent(double num, int power){			//finds num to the nth power
		if (power < 0){												//does not allow negative numbers
			throw new IllegalArgumentException("Exponential power must be positive. Please enter a positive value for the power.");
		}
		double answer = 1;
		for (int i = 1; i <= power; i++){
			answer = answer * num;
		}
		return answer;
	}
	public static int factorial(int num){			//finds num!
		if (num < 0){								//does not allow a negative number
			throw new IllegalArgumentException("Can only take the factorial of a positive number. Please enter a positive number.");
		}
		int answer = 1;								//multiplies all the numbers leading up to num together
		for (int i = 1; i <= num; i++){
			answer = answer * i;
		}
		return answer;
	}
	public static boolean isPrime(int num){			//checks whether a number is prime or not
		boolean prime = true;
		for (int i = 2; i < num; i++){				//checks if num is divisible by any of the values preceding it
			if (Calculate.isDivisibleBy(num, i)){
				prime = false;
			}
		}
		return prime;
	}
	public static int gcf(int x, int y){														//finds the greatest common factor
		int gfactor = 1;
		for (int i = 1; i <= Calculate.absValue(x) && i <= Calculate.absValue(y); i++){			//finds common factors of x and y in ascending order
			if (Calculate.isDivisibleBy(x, i) && Calculate.isDivisibleBy(y, i)){
				gfactor = i;																	//the last common factor is the greatest common factor
			}
		}
		return gfactor;
	}
	public static double sqrt(double x){			//finds the square root of a number
		if (x < 0){									//does not allow a negative number 
			throw new IllegalArgumentException("Can only take the square root of a positive number. Please enter a positive number.");
		}
		double sqrt = x/2;							//sqrt is the number we are trying to find
		double sqrt2;								//sqrt2 is sqrt(n-1)
		do{
			sqrt2 = sqrt;
			sqrt = (sqrt2 + x/sqrt2)/2;				//this is the algorithm that was introduced in the class
		} while ((sqrt2-sqrt) != 0);
		sqrt = Calculate.round2(sqrt);
		return sqrt-0.005;							//error compensation: correcting an error of being 0.005 over the actual square root
	}
	public static String quadForm(int a, int b, int c){			//finds the roots of a quadratic formula
		if (Calculate.discriminant(a, b, c) > 0){				//checks the discriminant to see if there are 0, 1, or 2 real roots
			return ((-b) + Calculate.sqrt(Calculate.square(b)-4*a*c))/(2*a) + " and "+ ((-b) - Calculate.sqrt(Calculate.square(b)-4*a*c))/(2*a);
		}														//returns the two real roots
		else if (Calculate.discriminant(a, b, c) < 0){
			return "No real roots.";
		}														//returns a no real root statement
		else{
			return (-b)/(2*a) + " ";
		}														//returns the real root
	}
}
