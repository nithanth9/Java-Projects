import java.util.Scanner;
public class Assignment7NithanthSivakumar {
	public static void main(String[]args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("Please enter an integer between 1 and 3");
		int integer;
		integer = number.nextInt();
		switch (integer) {
		
		case 1:
		System.out.print("One.");
		break;
		
		case 2:
		System.out.print("Two.");
		break;
		
		case 3:
		System.out.print("Three.");
		break;
		
		default:
		System.out.print("error: Enter one of the numbers - 1, 2, or 3");
		break;
		}
	}
}

		 
			 
		 
		
		
		
		
		
		
	

