import java.util.Scanner;
public class Assignment10NithanthSivakumar
{
	public static void main(String[] args)
	{


    Scanner in=new Scanner(System.in); 

    System.out.print("Please enter a positive nonzero integer: "); 

    int limit=in.nextInt(); 

    int sum=0; 

    for(int i=2; i<=limit; i+=2)

    {

      sum+=i; 

    }

    System.out.println("Sum: "+sum); 
	}

}