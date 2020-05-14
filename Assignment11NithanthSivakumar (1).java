import java.util.Scanner;

public class Assignment11NithanthSivakumar {

    public static void main(String[] args) {
        Scanner Test = new Scanner(System.in);
        System.out.print("How many tests do you have ? ");
        int n = Test.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter test score: ");
            scores[i] = Test.nextInt();
        }
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("Test Score Average: " + (total / scores.length));
    }
}
