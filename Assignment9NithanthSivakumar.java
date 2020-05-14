import java.util.Scanner;
public class Assignment9NithanthSivakumar 
{
	public static void main (String []args) 
	{
	
		int i=1,sum=0;
		System.out.println("Please enter a positive nonzero integer. "); 
		Scanner sc=new Scanner(System.in); 
		int num=sc.nextInt();
		do 
		{
		if(i%2!=0)
		sum=sum+i;
		i++;
		}while(i<=num);
		  
		System.out.println("Total: "+sum); 
	}
}