import java.util.Scanner;
public class Assignment5NithanthSivakumar {
  public static void main(String[] args) {
    System.out.print("Please enter an integer");
   
    Scanner input = new Scanner(System.in);
   
    int INTEGER = input.nextInt();
   
    if (INTEGER > 50) System.out.println("It is greater than 50");
    if (INTEGER < 50) System.out.println("It is less than 50");
    if (INTEGER == 50) System.out.println("It is 50");
  }
}

