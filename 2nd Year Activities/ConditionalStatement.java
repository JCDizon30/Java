package javaTutorial;
import java.util.*;

public class ConditionalStatement {
    
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int age = x.nextInt();
		boolean isVerified = false;
		
		if(age >= 18){
			System.out.println("You Have Access!!");
			if(isVerified) System.out.println("Qualified");
			else System.out.println("Not Qualifies");
		}else System.out.println("Access Denied");	
    }
}
