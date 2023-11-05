package javaTutorial;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		String x;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Name: ");
        x = s.nextLine();

        System.out.println("You are " + x);

	}

}
