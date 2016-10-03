/*
 * Justin Feng
 * Period 1
 * APCS
 * Collaborative Programming
 */

import java.util.*;
public class ProcessingNumber {
	public static void main(String[] args){
		Scanner userInput = new Scanner (System.in);
		System.out.print("How many numbers would you like to input? : ");
		int cycles = userInput.nextInt();
		System.out.print("Please enter " + cycles + " numbers : ");
		int numbers = userInput.nextInt();
		int evenSum = 0;
		int highest = numbers;
		int lowest = numbers;
		boolean even = false;
		int highestEven = 0;
		if (numbers % 2 == 0){
			evenSum += numbers;
		}
		for (int i = 2; i <= cycles; i++){
			numbers = userInput.nextInt();
			if (numbers > highest){
				highest = numbers;
			}
			else if (numbers < lowest){
				lowest = numbers;
			}
			if (numbers % 2 == 0){
				evenSum = evenSum + numbers;
				if (!even){
					highestEven = numbers;
					even = true;
				}
				if (numbers > highestEven){
					highestEven = numbers;
				}
			}
		}
		System.out.println("----------------------------------------------");
		if (even){
			System.out.println("The biggest even number is " + highestEven);
			System.out.println("The total of the even numbers is " + evenSum);
		}
		else{
			System.out.println("No even numbers entered.");
		}
		System.out.println("The biggest number is " + highest);
		System.out.println("The smallest number is " + lowest);
		System.out.println("----------------------------------------------");
	}
}
