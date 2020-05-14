import java.util.Scanner;
public class Assignment8NithanthSivakumar {
	public static void main(String[]args) {
		
		Scanner Test = new Scanner(System.in);
       
		int total = 0;
		int gradenumber = 1;
		
		while (gradenumber <= 5)
		{
			System.out.print("Please enter a test score");
			int grade = Test.nextInt();
			total = total + grade;
			gradenumber = gradenumber +1;
		}
		int average = total / 5;
		
		System.out.printf("Your test score average: %d%n", average);	
		}
	}