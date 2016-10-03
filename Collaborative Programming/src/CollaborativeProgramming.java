/*
 * Justin Feng
 * Period 1
 * APCS
 * Collaborative Programming
 */

import java.util.*;
public class CollaborativeProgramming{
	public static void main(String[] args){
		Scanner userInput = new Scanner (System.in);
		System.out.print("How many numbers would you like to input? : ");			//asks for numbers of inputs
		int cycles = userInput.nextInt();											
		System.out.print("Please enter " + cycles + " numbers : ");					//asks for numbers
		int numbers = userInput.nextInt();
		int evenSum = 0;															//initializing variables
		int highest = numbers;
		int lowest = numbers;
		boolean even = false;														//"even" stores whether an even number has been entered
		int highestEven = 0;
		if (numbers % 2 == 0){														//adds "numbers" to the sum of even numbers if "numbers" is even
			evenSum += numbers;
		}
		for (int i = 2; i <= cycles; i++){											//loops for "cycle" number of times
			numbers = userInput.nextInt();
			if (numbers > highest){													//identifies largest number
				highest = numbers;
			}
			else if (numbers < lowest){												//identifies lowest number
				lowest = numbers;
			}
			if (numbers % 2 == 0){													//identifies even numbers
				evenSum = evenSum + numbers;
				if (!even){															//if "numbers" is the first even number entered...
					highestEven = numbers;											//...it is set as the highest even number
					even = true;													//"even" is set to true, since an even number is entered
				}
				else if (numbers > highestEven){									//identifies largest even number
					highestEven = numbers;
				}
			}
		}
		System.out.println("----------------------------------------------");
		if (even){																	//displays data for even numbers if at least one even number was entered
			System.out.println("The biggest even number is " + highestEven);
			System.out.println("The total of the even numbers is " + evenSum);
		}
		else{																		//does not display data for even numbers if no even numbers were entered
			System.out.println("No even numbers entered.");
		}
		System.out.println("The biggest number is " + highest);
		System.out.println("The smallest number is " + lowest);
		System.out.println("----------------------------------------------");
	}
}
