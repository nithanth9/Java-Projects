import java.util.Scanner;
public class Assignment6NithanthSivakumar {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		double score1;
		double score2;
		double score3;
		double score4;
		double average;
		
		
		System.out.print("Please enter a test score");
		 score1 = input.nextDouble();
		
		System.out.print("Please enter a test score");
		 score2 = input.nextDouble();
		
		System.out.print("Please enter a test score");
		 score3 = input.nextDouble();
		
		System.out.print("Please enter a test score");
		 score4 = input.nextDouble();
		
		 average = (score1 + score2 + score3 + score4) / 4;
		 
		 System.out.printf("Your Test score average is %f",average );
		 
		 if( average < 60 ) {
			 System.out.println("\nYour Grade is F");
		 
		 }else if( average > 60 && average < 70) {
			 System.out.println("\nYour Grade is D");
			 
		 }else if( average > 70 && average < 80) {
			 System.out.println("\nYour Grade is C");
		 
		 }else if( average > 80 && average < 89) {
			 System.out.println("\nYour Grade is B");
		 
		 }else if( average >= 90) {
			 System.out.println("\nYour Grade is A");}
		 
	}
}
		 
			 
		 
		
		
		
		
		
		
	

