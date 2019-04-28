import java.util.Scanner;
class Main
{
   public static int square (int n)
   { 
     int sqr=n*n;
     return sqr;
   }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int square = square(number);
      System.out.println(square);
	} 
}