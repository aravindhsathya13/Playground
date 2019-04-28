import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   int n, Temp, Reminder, Sum = 0, i, Factorial;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();		
		
		Temp =n;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
            }
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		if ( n == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}