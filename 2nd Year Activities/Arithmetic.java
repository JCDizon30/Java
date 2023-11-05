package javaTutorial;
import java.util.Scanner;

public class Arithmetic {
	
	 public static void main(String[] args) {
		 
		 int x;
	        int y;

	        Scanner classname = new Scanner(System.in);

	        System.out.print("First Number ");
	        x = classname.nextInt();

	        System.out.print("Second Number ");
	        y = classname.nextInt();

	        int Result = x * y;

	        System.out.println("Result of: " + x + " * " + y + " = " + Result);
	    }

}
