import java.util.Scanner;

public class MagpieRunner4 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie4 maggie = new Magpie4();

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
