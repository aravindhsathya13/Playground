import java.util.Scanner;
public class Main{
  
    public static int gcd(int n1,int n2, int n3,int min)
    {
      int a=0;
      if(((min/n1)==0)&&((min/n2)==0)&&((min/n3)==0))
         a = min;
       else
         { min = min-1;
           for(int i=min; i>=0;i--)
           { 
             if(((i/n1)==0)&&((i/n2)==0)&&((i/n3)==0))
                a = min;
            }    
          }
     return a;
       }
	public static void main (String[] args)
	{
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int min;
        if((n1<n2)&&(n1<n3))
          min = n1;
        else if((n2<n1)&&(n2<n3))
          min = n2;
        else 
          min = n3;
        int gcd=gcd(n1,n2,n3,min);
        gcd=gcd+1;
        System.out.print(gcd);
         
	}
}