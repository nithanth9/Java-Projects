package stringvars;

import java.util.Scanner;
 
public class Assignment4NithanthSivakumar {
 
 public static void main(String[] args) {
  Scanner testscore = new Scanner(System.in);
   
  System.out.print("Please enter a test score");
  int num1 = testscore.nextInt();
   
  System.out.print("Please enter a test score");
  int num2 = testscore.nextInt();
   
  System.out.print("Please enter a test score");
  int num3 = testscore.nextInt();
   
  System.out.println("Your test score average: " + 
   (num1 + num2 + num3) / 3);
testscore.close();
  }
}
