import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int max1=largeone(n1,n2);
      if(max1>n3)
        System.out.print(max1);
      else
        System.out.print(n3);
	}
  public static int largeone(int n1, int n2){
     int max;
     if(n1>n2)
       max=n1;
    else
      max=n2;
      return max;
  }
    
}