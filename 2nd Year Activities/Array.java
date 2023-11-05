package javaTutorial;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
	
	//Declare with Values
						// 0 	   1	 2		 3		   4
	String student1[] = {"David","John","Ace","Alenere","Jasper"};	
	//Reading Array Element
	System.out.println(student1[3]);
	
	String student2[] = {"David","John","Ace","Alenere","Jasper"};
	//Accessing or Changing Arrays
	student2[3] = "Carlo";
	System.out.println(student2[3]);
	
	int numbers[] = {1,2,3,4,5,6,7,8,9,10};	
	System.out.println(numbers[5] + numbers[9]);
	
	
	//Declare without Values
	String employees[] = new String[20];
	employees[0] = "John";
	employees[1] = "Carlo";
	employees[2] = "Dizon";
	System.out.println(employees[1]);
	
	
	//*Assigning Array Element w/ User Input
	Scanner e = new Scanner(System.in);
	String employees1[] = new String[10];
	
	System.out.print("Enter Employee Name: ");
	employees1[4] = e.nextLine();
	System.out.print("Hello " + employees1[4]);
	
	}	
}