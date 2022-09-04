package just; // package 
import java.util.Scanner; // This is import method and need to import to use Scanner 

public class InputJava {
	
public static void main(String[]args) {
	
	Scanner scanner = new Scanner(System.in);// Use this one as a template for your next project
	 
	
	System.out.println("What is your name?  ");
	String name = scanner.nextLine();
	System.out.println("How old are you?  "  );
	int age = scanner.nextInt();
	 scanner.nextLine();   //in order to read scanner need to add this here
	System.out.println("What is your favourite food?  ");
	String  food = scanner.nextLine();
	

	System.out.println("What is your phone number?  ");
	String number = scanner.nextLine();
	
	
	
	System.out.println("Hello " +name);
	System.out.println("Your age is  " +age);
	System.out.println("You like " +food);
	System.out.println("Your Phone Number is +" + number);
}	
}
