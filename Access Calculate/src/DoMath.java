
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.discriminant(2,3,2));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(1,3,1,-4,"x"));
		System.out.println(Calculate.isDivisibleBy(-12,4));
		System.out.println(Calculate.isDivisibleBy(12,5));
		System.out.println(Calculate.absValue(-47));
		System.out.println(Calculate.max(12,32));
		System.out.println(Calculate.max(3.14563,2.563657,6.74567));
		System.out.println(Calculate.min(3,5));
		System.out.println(Calculate.round2(3.14563));
		System.out.println(Calculate.exponent(2.0,3));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(43));
		System.out.println(Calculate.gcf(60,-96));
		System.out.println(Calculate.sqrt(35.8765));
		System.out.println(Calculate.quadForm(1,2,1));
		System.out.println(Calculate.quadForm(4,-2,3));
		System.out.println(Calculate.quadForm(1,8,12));
	}

}
