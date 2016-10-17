import java.util.Scanner;

//A simple class to run the Magpie class.

public class MagpieRunner2 {

	// Create a Magpie, give it user input, and print its replies.

	public static void main(String[] args) {
		Magpie2 maggie = new Magpie2();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			if (statement.trim().length() <=0){
				System.out.println("Wow...giving me the silent treatment, I see......");
				statement = in.nextLine();
			}
			else{
				System.out.println(maggie.getResponse(statement));
				statement = in.nextLine();
			}
		}
	}

}
