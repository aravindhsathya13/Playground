import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
		int n1;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	
		
		n1 = n;
		while(n1 >= 100)
		{
			n1 = n1 / 10;
		}	
        n1=n1%10;
		
		System.out.println(n1);
      
	

      
	}
}