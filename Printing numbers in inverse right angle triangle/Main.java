import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      for( int row=n; row>=1; row--)
      { int num=n;
        for( int col=row; col>=1; col--)
        { System.out.print(col);
         num=num-1;
          }
      System.out.println("");
      }
    }    
}