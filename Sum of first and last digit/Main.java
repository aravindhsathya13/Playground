import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
		int  n1, n2;
      Scanner in = new Scanner(System.in);
	int n = in.nextInt();	
		
		n1 = n;
		while(n1>= 10)
		{
			n1 = n1 / 10;
		}	
		
		n2 = n % 10;
		
		int sum=n1+n2;
		System.out.println(sum);

      
	}
}