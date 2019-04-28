import java.util.Scanner;
class Main{
  public static int sumd(int n){
    int sum=0;
    for (int i=1;i<=n;i++)
       sum=sum+i;
    return sum;
      }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int out=sumd(number);
      System.out.println(out);
	}
}