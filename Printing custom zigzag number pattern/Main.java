import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row=1;row<=n;row++)
      {
          for(int col=1;col<=n;col++)
          { if(col==1)
               { if(row%2==0)
                  System.out.print(row+1);
                 else 
                   System.out.print(row); 
               }
             else if(col==n)
                { if(row%2!=0)
                  System.out.print(row+1);
                  else 
                  System.out.print(row);
                }
           else 
             System.out.print(row);
                             }                             
      System.out.println("");}
                             
	}
}
